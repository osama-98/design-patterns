package SimpleFactory;

import SimpleFactory.Modules.*;

/**
 * This class acts as a simple factory for creation of
 * different posts on website.
 */
public class PostFactory {
    public static Post createPost(String type) {
        return switch (type.toLowerCase()) {
            case "blog" -> new BlogPost();
            case "product" -> new ProductPost();
            case "news" -> new NewsPost();
            default -> throw new IllegalArgumentException(type + " post type is unknown");
        };
    }
}


