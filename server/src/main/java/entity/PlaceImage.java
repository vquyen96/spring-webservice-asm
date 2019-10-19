package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "place_image")
public class PlaceImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String urlIma;
    private float rating;
    private long createdAt;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<RatePlaceImage> ratePlaceImages;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "placeImage")
    private Set<CommentImage> commentImages;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    public PlaceImage() {
        this.createdAt = System.currentTimeMillis();
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
}
