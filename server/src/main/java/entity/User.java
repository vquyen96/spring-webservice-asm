package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    private String username;
    private String email;
    private String password;
    private String salt;
    private String urlImage;
    private int role;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "user")
    private Set<Place> places;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "user")
    private Set<RatePlaceImage> ratePlaceImages;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "user")
    private Set<RatePlace> ratePlaces;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "user")
    private Set<CommentPlace> commentPlaces;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "user")
    private Set<CommentImage> commentImages;

    private long createdAt;
    private long updatedAt;
    private String status;

    public User() {
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.status = StatusEnum.ACTIVE.name();
        this.role = 1;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public Set<RatePlaceImage> getRatePlaceImages() {
        return ratePlaceImages;
    }

    public void setRatePlaceImages(Set<RatePlaceImage> ratePlaceImages) {
        this.ratePlaceImages = ratePlaceImages;
    }

    public Set<RatePlace> getRatePlaces() {
        return ratePlaces;
    }

    public void setRatePlaces(Set<RatePlace> ratePlaces) {
        this.ratePlaces = ratePlaces;
    }

    public Set<CommentPlace> getCommentPlaces() {
        return commentPlaces;
    }

    public void setCommentPlaces(Set<CommentPlace> commentPlaces) {
        this.commentPlaces = commentPlaces;
    }

    public Set<CommentImage> getCommentImages() {
        return commentImages;
    }

    public void setCommentImages(Set<CommentImage> commentImages) {
        this.commentImages = commentImages;
    }
}
