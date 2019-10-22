package service;

import entity.Place;
import entity.PlaceImage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService
public class PlaceImageService {

    private static Logger LOGGER = Logger.getLogger(PlaceImage.class.getSimpleName());

    @WebMethod
    public void save(PlaceImage placeImage) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(placeImage);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    @WebMethod
    public List<PlaceImage> findAllImageOfPlaceByPlaceId(String id) {
        List<PlaceImage> listImageOfPlace= new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from place_image where place_id = :place_id ");
            query.setParameter("place_id", id);
            listImageOfPlace = ((org.hibernate.query.Query) query).list();
            transaction.commit();
            return listImageOfPlace;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }

    @WebMethod
    public PlaceImage findById(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            PlaceImage placeImage = session.get(PlaceImage.class, id);
            transaction.commit();
            return placeImage;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Can not findById %s place, stack trace", id), e);
            return null;
        }
    }
}
