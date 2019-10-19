package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "place_image")
public class PlaceImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_image_id")
    private int id;
    private String urlIma;
    private float rating;
    private long createdAt;
    private long updatedAt;
    private String status;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "placeImage")
    private Set<RatePlaceImage> ratePlaceImages;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "placeImage")
    private Set<CommentImage> commentImages;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    public PlaceImage() {
        this.createdAt = System.currentTimeMillis();
        this.createdAt = System.currentTimeMillis();
        this.status = StatusEnum.ACTIVE.name();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlIma() {
        return urlIma;
    }

    public void setUrlIma(String urlIma) {
        this.urlIma = urlIma;
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

    public Set<RatePlaceImage> getRatePlaceImages() {
        return ratePlaceImages;
    }

    public void setRatePlaceImages(Set<RatePlaceImage> ratePlaceImages) {
        this.ratePlaceImages = ratePlaceImages;
    }

    public Set<CommentImage> getCommentImages() {
        return commentImages;
    }

    public void setCommentImages(Set<CommentImage> commentImages) {
        this.commentImages = commentImages;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
