package entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rate_place_image")
public class RatePlaceImage {

    private int rate_point;
    private long createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "place_image_id")
    private PlaceImage placeImage;

    public RatePlaceImage() {
        this.createdAt = System.currentTimeMillis();
    }

    public int getRate_point() {
        return rate_point;
    }

    public void setRate_point(int rate_point) {
        this.rate_point = rate_point;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
