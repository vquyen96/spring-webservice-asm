package service;

import entity.PlaceImage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@WebService
public class PlaceImageService {

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
}
