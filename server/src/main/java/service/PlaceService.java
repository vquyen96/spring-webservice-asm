package service;

import entity.Place;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService
public class PlaceService {
    private static Logger LOGGER = Logger.getLogger(PlaceService.class.getSimpleName());

    @WebMethod
    public void save(Place place) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(place);
            transaction.commit();
            LOGGER.log(Level.INFO, String.format("Save place success with name %s", place.getName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Save place error, stack trace"), e);
        }
    }

    @WebMethod
    public List<Place> findAll() {
        List<Place> places = new ArrayList<>();
        try (Session session = HibernateUtil.getSession()) {
            places = session.createQuery("from Place", Place.class).list();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Can not findAll place, stack trace"), e);
        }
        return places;
    }

    @WebMethod
    public Place findById(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Place place = session.get(Place.class, id);
            transaction.commit();
            return place;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Can not findById %s place, stack trace", id), e);
            return null;
        }
    }

    @WebMethod
    public void delete(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Place place = session.get(Place.class, id);
            if (place != null) {
                session.delete(place);
                LOGGER.log(Level.INFO, String.format("Delete place success with id %s", id));
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Can not delete place with id %s, stack trace", id), e);
        }
    }
}
