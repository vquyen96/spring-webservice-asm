package service;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import util.PasswordUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SignInService {

    @WebMethod
    public String login(String username, String password) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            User user = findByUsername(username.toLowerCase().trim());

            if (user != null) {
                if (password == PasswordUtil.generateSecurePassword(user.getPassword(), user.getSalt())) {
                    return "Login success.";
                } else {
                    return "Username or password invalid.";
                }
            } else {
                return "Username or password invalid.";
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return "Something went wrong, please try again.";
    }

    @WebMethod
    public User findByUsername(String username) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, username);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }

}
