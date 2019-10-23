package service;

import entity.Category;
import entity.User;
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
public class CategoryService {

    @WebMethod
    public void save(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(category);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
    }

    @WebMethod
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        try (Session session = HibernateUtil.getSession()) {
            categories = session.createQuery("from Category", Category.class).list();
        } catch (Exception e) {

        }
        return categories;
    }

    @WebMethod
    public Category findById(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Category category = session.get(Category.class, id);
            transaction.commit();
            return category;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }

            return null;
        }
    }

    @WebMethod
    public void delete(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Category category = session.get(Category.class, id);
            if (category != null) {
                session.delete(category);

            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            
        }
    }
}