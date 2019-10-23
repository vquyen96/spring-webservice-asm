package service;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;
import util.HibernateUtil;
import util.PasswordUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@WebService
public class SignInService {

    @Test
    @WebMethod
    public String login(String username, String password) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();

            User user = findByUsername(username.toLowerCase().trim());

            if (user != null) {
                if (PasswordUtil.verifyUserPassword(password, user.getPassword(), user.getSalt())) {
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

    @Test
    @WebMethod
    public User findByUsername(String username) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<User> query = builder.createQuery(User.class);
            Root<User> root = query.from(User.class);
            query.select(root).where(builder.equal(root.get("username"), username));
            Query<User> q = session.createQuery(query);
            User user = q.getSingleResult();
            transaction.commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
            return null;
        }
    }

}
