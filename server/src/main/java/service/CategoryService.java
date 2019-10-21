package service;

import entity.Category;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService
public class CategoryService {
    private static Logger LOGGER = Logger.getLogger(CategoryService.class.getSimpleName());
    @WebMethod
    public void save(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(category);
            transaction.commit();
            LOGGER.log(Level.INFO, String.format("Save category success with name %s", category.getName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Save category error, stack trace"), e);
        }
    }

    @WebMethod
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        try (Session session = HibernateUtil.getSession()) {
            categories = session.createQuery("from category", Category.class).list();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Can not findAll category, stack trace"), e);
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
            LOGGER.log(Level.SEVERE, String.format("Can not findById %s category, stack trace", id), e);
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
                LOGGER.log(Level.INFO, String.format("Delete category success with id %s", id));
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            LOGGER.log(Level.SEVERE, String.format("Can not delete category with id %s, stack trace", id), e);
        }
    }
}
