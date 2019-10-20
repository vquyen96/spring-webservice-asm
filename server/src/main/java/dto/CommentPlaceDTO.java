package dto;

import entity.CommentPlace;
import util.DateTimeUtil;
import util.ObjectUtil;

public class CommentPlaceDTO {
    private int id;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;
    private String status;

    public CommentPlaceDTO(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public CommentPlaceDTO(CommentPlace commentPlace) {
        this.content = "";
        ObjectUtil.cloneObject(this, commentPlace);
        this.status = commentPlace.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(commentPlace.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(commentPlace.getUpdatedAt());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
