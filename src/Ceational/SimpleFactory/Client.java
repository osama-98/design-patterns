package Ceational.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        // Blog
        Post post = PostFactory.createPost(PostType.Blog);
        System.out.println(post);

        // Product
        Post product = PostFactory.createPost(PostType.Product);
        System.out.println(product);

        // News
        Post news = PostFactory.createPost(PostType.News);
        System.out.println(news);
    }
}
