package Creational.SimpleFactory;

import Creational.SimpleFactory.Modules.*;

/**
 * This class acts as a simple factory for creation of
 * different posts on website.
 */
public class PostFactory {
    public static Post createPost(String type) {
        return switch (type.toLowerCase()) {
            case PostType.Blog -> new BlogPost();
            case PostType.Product -> new ProductPost();
            case PostType.News -> new NewsPost();
            default -> throw new IllegalArgumentException(type + " post type is unknown");
        };
    }
}


