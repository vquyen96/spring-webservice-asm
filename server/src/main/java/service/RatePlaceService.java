package service;

import entity.RatePlace;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService
public class RatePlaceService {

    private static Logger LOGGER = Logger.getLogger(RatePlaceService.class.getSimpleName());
    @WebMethod
    public void save(RatePlace ratePlace) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(ratePlace);
            transaction.commit();
            LOGGER.log(Level.INFO, String.format("Save ratePlace success with name %s", ratePlace.getName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Save ratePlace error, stack trace"), e);
        }
    }

    @WebMethod
    public List<RatePlace> findAllPlaceId(int id) {
        List<RatePlace> listRate = new ArrayList<>();
        try (Session session = HibernateUtil.getSession()) {
            Query query = session.createQuery("from rate_place where place_id = :place_id ");
            query.setParameter("place_id", id);
            listRate = query.list();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Can not findAll ratePlace, stack trace"), e);
        }
        return listRate;
    }

}