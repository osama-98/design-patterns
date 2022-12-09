package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        // Blog
        Post post = PostFactory.createPost("blog");
        System.out.println(post);

        // Product
        Post product = PostFactory.createPost("product");
        System.out.println(product);

        // News
        Post news = PostFactory.createPost("news");
        System.out.println(news);
    }
}
