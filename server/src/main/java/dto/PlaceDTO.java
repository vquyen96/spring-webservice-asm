package dto;

import entity.Place;
import util.DateTimeUtil;
import util.ObjectUtil;

public class PlaceDTO {
    private int id;
    private String name;
    private String summary;
    private String description;
    private float rating;
    private String createdAt;
    private String updatedAt;
    private String status;

    public PlaceDTO(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public PlaceDTO(Place place) {
        this.summary = "";
        this.description = "";
        ObjectUtil.cloneObject(this, place);
        this.rating = place.getRating();
        this.status = place.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(place.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(place.getUpdatedAt());
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
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
