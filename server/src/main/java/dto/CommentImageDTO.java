package dto;

import entity.CommentImage;
import util.DateTimeUtil;
import util.ObjectUtil;

public class CommentImageDTO {
    private int id;
    private String title;
    private String content;
    private String status;
    private String createdAt;
    private String updatedAt;


    public CommentImageDTO(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public CommentImageDTO(CommentImage commentImage) {
        this.content = "";
        ObjectUtil.cloneObject(this, commentImage);
        this.status = commentImage.getStatus();
        this.createdAt = DateTimeUtil.formatDateFromLong(commentImage.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(commentImage.getUpdatedAt());
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

