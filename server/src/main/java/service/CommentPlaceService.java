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
public class CommentPlaceService {
    @WebMethod
    public void save(CommentPlace commentPlace) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(commentPlace);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    @WebMethod
    public List<CommentPlace> findAllCommentOfPlaceByPlaceId(String id) {
        List<CommentPlace> listComment= new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from comment_place where place_id = :place_id ");
            query.setParameter("place_id", id);
            listComment = ((org.hibernate.query.Query) query).list();
            transaction.commit();
            return listComment;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }
}
