package entity;

import javax.persistence.*;

@Entity
@Table(name = "comment_place")
public class CommentPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private String comment_col;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private long createdAt;

    public CommentPlace() {
        this.createdAt = System.currentTimeMillis();
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

    public String getComment_col() {
        return comment_col;
    }

    public void setComment_col(String comment_col) {
        this.comment_col = comment_col;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
