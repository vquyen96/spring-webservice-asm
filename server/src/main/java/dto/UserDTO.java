package dto;

import entity.User;
import util.ObjectUtil;

public class UserDTO {
    private int id;
    private String username;
    private String email;
    private String password;
    private String urlImage;
    private int role;

    public UserDTO(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserDTO(User user) {
        ObjectUtil.cloneObject(this, user);
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.urlImage = user.getUrlImage();
        this.role = user.getRole();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
