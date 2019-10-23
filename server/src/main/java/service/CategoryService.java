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

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@WebService
public class CategoryService {

    @WebMethod
    public void save(Category category) {
        System.out.println(category.getName());
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(category);
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
