package dto;

import entity.CommentPlaceImage;
import util.DateTimeUtil;
import util.ObjectUtil;

public class CommentPlaceImageDTO {
    private int id;
    private String urlIma;
    private String status;
    private String createdAt;
    private String updatedAt;

    public CommentPlaceImageDTO(int id, String urlIma) {
        this.id = id;
        this.urlIma = urlIma;
    }

    public CommentPlaceImageDTO(CommentPlaceImage commentPlaceImage) {
        ObjectUtil.cloneObject(this, commentPlaceImage);
        this.status = commentPlaceImage.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(commentPlaceImage.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(commentPlaceImage.getUpdatedAt());
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
