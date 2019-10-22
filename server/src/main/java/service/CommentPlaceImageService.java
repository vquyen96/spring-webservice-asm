package service;

import entity.CommentPlace;
import entity.CommentPlaceImage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CommentPlaceImageService {

    @WebMethod
    public void save(CommentPlaceImage commentPlaceImage) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(commentPlaceImage);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    @WebMethod
    public List<CommentPlaceImage> findAllImageOfCommentByCommentId(String id) {
        List<CommentPlaceImage> commentPlaceImages= new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from comment_place_image where comment_place_id = :comment_place_id ");
            query.setParameter("comment_place_id", id);
            commentPlaceImages = ((org.hibernate.query.Query) query).list();
            transaction.commit();
            return commentPlaceImages;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }
}
