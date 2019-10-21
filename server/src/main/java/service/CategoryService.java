package service;

import entity.Category;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CategoryService {

    @WebMethod
    public String register(Category category) {
        String msg = "Registration unsuccessful, try again.....";
        Session session = HibernateUtil.getSession();
        if (session != null) {
            try {
                if (category != null) {
                    String name = (String) session.save(category);
                    session.beginTransaction().commit();
                    msg = "User " + name
                            + " created successfully, please login...";
                }
            } catch (Exception exception) {
                System.out.println("Exception occred while reading user data: "
                        + exception.getMessage());
            }

        } else {
            System.out.println("DB server down.....");
        }
        System.out.println("msg:" + msg);
        return msg;
    }
}
