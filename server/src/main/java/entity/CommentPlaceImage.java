package entity;

import javax.persistence.*;

@Entity
@Table(name = "comment_place_image")
public class CommentPlaceImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String urlIma;
    private long createdAt;

    @ManyToOne
    @JoinColumn(name = "comment_place_id")
    private CommentPlace commentPlace;

    public CommentPlaceImage() {
        this.createdAt = System.currentTimeMillis();
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

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
