package t1708e.webservice.client.serviceData;

import t1708e.webservice.client.service.User;
import t1708e.webservice.client.entity.StatusEnum;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> userList = new ArrayList<>();
    private static int increment = 1;

    public void init() {
        String imageAddress = "https://www.klrealty.com.au/wp-content/uploads/2018/11/user-image-.png";
        userList.add(new User(increment++, "vquyenaaa@gmail.com", imageAddress, 1, StatusEnum.ACTIVE.name()));
        userList.add(new User(increment++, "quyendvd00557@fpt.edu.vn", imageAddress, 1, StatusEnum.ACTIVE.name()));
        userList.add(new User(increment++, "tuannvd00589@fpt.edu.vn", imageAddress, 1, StatusEnum.ACTIVE.name()));
        userList.add(new User(increment++, "hungpvhd00588@fpt.edu.vn", imageAddress, 1, StatusEnum.ACTIVE.name()));
    }

    public List<User> findAll() {
        return userList;
    }

    public User save (User user) {
        user.setId(increment++);
        userList.add(user);
        return user;
    }

    public User findById(int id) {
        if (id > userList.size()) {
            return null;
        }
        return userList.get(id-1);
    }

    public User update(int id, User user) {
        if (id > userList.size()) {
            return null;
        }
        userList.set(id - 1, user);
        return user;
    }
}
