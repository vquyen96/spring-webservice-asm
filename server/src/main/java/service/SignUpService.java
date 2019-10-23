package service;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import util.PasswordUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SignUpService {

    @WebMethod
    public void create(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            user.setEmail(user.getEmail().toLowerCase().trim());
            user.setUsername(user.getUsername().toLowerCase().trim());
            user.setSalt(PasswordUtil.getSalt(30));
            user.setPassword(PasswordUtil.generateSecurePassword(user.getPassword(), user.getSalt()));
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @WebMethod
    public String findByEmail(String email) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, email);
            transaction.commit();
            return user.getEmail();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }

    @WebMethod
    public String findByUsername(String username) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            transaction.commit();
            return user.getUsername();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }

}
