package service;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SignInService {

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
