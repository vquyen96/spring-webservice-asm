package dto;

import entity.RatePlace;
import util.DateTimeUtil;
import util.ObjectUtil;

public class RatePlaceDTO {
    private int id;
    private int rate_point;
    private String status;
    private String createdAt;
    private String updatedAt;

    public RatePlaceDTO(int id, int rate_point) {
        this.id = id;
        this.rate_point = rate_point;
    }

    public RatePlaceDTO(RatePlace ratePlace) {
        ObjectUtil.cloneObject(this, ratePlace);
        this.status = ratePlace.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(ratePlace.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(ratePlace.getUpdatedAt());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate_point() {
        return rate_point;
    }

    public void setRate_point(int rate_point) {
        this.rate_point = rate_point;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
