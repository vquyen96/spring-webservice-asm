package entity;

import javax.persistence.*;

@Entity
@Table(name = "rate_place")
public class RatePlace {

    private int rate_point;
    private long createdAt;
    private long updatedAt;
    private String status;

    @Id
    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public RatePlace() {
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.status = StatusEnum.ACTIVE.name();
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
}
