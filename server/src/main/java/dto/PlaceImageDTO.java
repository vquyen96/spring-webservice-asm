package dto;

import entity.PlaceImage;
import util.DateTimeUtil;
import util.ObjectUtil;

public class PlaceImageDTO {
    private int id;
    private String urlIma;
    private float rating;
    private String createdAt;
    private String updatedAt;
    private String status;

    public PlaceImageDTO(int id, String urlIma) {
        this.id = id;
        this.urlIma = urlIma;
    }

    public PlaceImageDTO(PlaceImage placeImage) {
        ObjectUtil.cloneObject(this, placeImage);
        this.rating = placeImage.getRating();
        this.status = placeImage.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(placeImage.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(placeImage.getUpdatedAt());
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
