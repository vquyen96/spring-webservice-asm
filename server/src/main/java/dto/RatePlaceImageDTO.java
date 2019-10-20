package dto;

import entity.RatePlaceImage;
import util.DateTimeUtil;
import util.ObjectUtil;

public class RatePlaceImageDTO {
    private int id;
    private int rate_point;
    private String createdAt;
    private String updatedAt;
    private String status;

    public RatePlaceImageDTO(int id, int rate_point) {
        this.id = id;
        this.rate_point = rate_point;
    }

    public RatePlaceImageDTO(RatePlaceImage ratePlaceImage) {
        ObjectUtil.cloneObject(this, ratePlaceImage);
        this.status = ratePlaceImage.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(ratePlaceImage.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(ratePlaceImage.getUpdatedAt());
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
