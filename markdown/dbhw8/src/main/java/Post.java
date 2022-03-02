import java.time.LocalDate;

public class Post {
    private int id;
    private String title;
    private String content;
    private String description;
    private String thumnail;
    private int id_category;
    private int id_author;
    private LocalDate create_at;
    private String status;

    public Post(int id, String title, String content, String description, String thumnail, int id_category, int id_author, LocalDate create_at, String status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.description = description;
        this.thumnail = thumnail;
        this.id_category = id_category;
        this.id_author = id_author;
        this.create_at = create_at;
        this.status = status;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public LocalDate getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDate create_at) {
        this.create_at = create_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", thumnail='" + thumnail + '\'' +
                ", id_category=" + id_category +
                ", id_author=" + id_author +
                ", create_at=" + create_at +
                ", status='" + status + '\'' +
                '}';
    }
}
