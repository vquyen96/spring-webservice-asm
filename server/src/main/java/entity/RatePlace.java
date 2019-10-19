package entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rate_place")
public class RatePlace {

    private int rate_point;
    private long createdAt;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public RatePlace() {
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
