package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private int id;
    private String name;
    private int summary;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    private float rating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "place")
    private Set<PlaceImage> placeImages;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "place")
    private Set<RatePlace> ratePlaces;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "place")
    private Set<CommentPlace> commentPlaces;

    private long createdAt;
    private long updatedAt;
    private String status;

    public Place() {
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.status = StatusEnum.ACTIVE.name();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<PlaceImage> getPlaceImages() {
        return placeImages;
    }

    public void setPlaceImages(Set<PlaceImage> placeImages) {
        this.placeImages = placeImages;
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
}
