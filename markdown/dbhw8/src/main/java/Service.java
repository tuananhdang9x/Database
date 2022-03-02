import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn = connectDatabase.connect();

    public List<Post> getPostByStatus(){
        String query = "SELECT p.id ,p.title,p.content ,p.description,p.thumnail,p.id_category ,p.id_author ,p.create_at,p.status \n" +
                "FROM post p \n" +
                "WHERE p.status = 'Public'";
        List<Post> posts = new ArrayList<>();
        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()){
                int id = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String thumnail = result.getString("thumnail");
                int id_category = result.getInt("id_category");
                int id_author = result.getInt("id_author");
                LocalDate date = LocalDate.parse(result.getString("create_at"));
                String status = result.getString("status");
                posts.add(new Post(id,title,content,description,thumnail,id_category,id_author,date, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }

    public List<Post> getPostById(){
        String query = "SELECT p.id ,p.title,p.content ,p.description,p.thumnail,p.id_category ,p.id_author ,p.create_at,p.status \n" +
                "FROM post p \n" +
                "WHERE p.id = 1";
        List<Post> posts = new ArrayList<>();
        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()){
                int id = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String thumnail = result.getString("thumnail");
                int id_category = result.getInt("id_category");
                int id_author = result.getInt("id_author");
                LocalDate date = LocalDate.parse(result.getString("create_at"));
                String status = result.getString("status");
                posts.add(new Post(id,title,content,description,thumnail,id_category,id_author,date, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }

    public Post findPostById(int id){
        Post findPost = null;
        String query = "SELECT p.id ,p.title,p.content ,p.description,p.thumnail,p.id_category ,p.id_author ,p.create_at,p.status \n" +
                "FROM post p \n" +
                "WHERE p.id= "+id;

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()){
                int idPost = result.getInt("id");
                String title = result.getString("title");
                String content = result.getString("content");
                String description = result.getString("description");
                String thumnail = result.getString("thumnail");
                int id_category = result.getInt("id_category");
                int id_author = result.getInt("id_author");
                LocalDate date = LocalDate.parse(result.getString("create_at"));
                String status = result.getString("status");
                findPost = new Post(idPost,title,content,description,thumnail,id_category,id_author,date,status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return findPost;
    }

    public void updatePost(String title, String content){
        String query ="UPDATE post \n" +
                "SET title = '"+title+"',  content = '"+content+"'\n" +
                "WHERE id = 1";

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Cập nhật thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePost(Post post){
        String query = "DELETE FROM `post` WHERE id = " + post.getId();

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Xóa thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void show(List<Post> posts){
        for (Post p:posts){
            System.out.println(p);
        }
    }

    public void addPost(Post post){
        String query = "INSERT INTO post (id,title,content,description,thumnail,id_category,id_author,create_at,status) " +
                "VALUES ('"+post.getId()+"','"+post.getTitle()+"','"+post.getContent()+"','"+post.getDescription()+"','"+post.getThumnail()+"','"+post.getId_category()+"','"+post.getId_author()+"','"+post.getCreate_at()+"','"+post.getStatus()+"')";

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("thêm thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
