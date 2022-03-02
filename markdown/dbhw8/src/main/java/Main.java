import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.updatePost("abc","abc");

        Post findPost = service.findPostById(1);
        service.deletePost(findPost);

        Post post = new Post(8,"sach moi","giao duc","abc","abc",4,6, LocalDate.now(),"Public");
        service.addPost(post);

    }
}
