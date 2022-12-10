package Creational.FactoryMethod.Message;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 */
public abstract class Message {

    public String headers;
    public abstract String getContent();

    public void addDefaultHeaders() {
        this.headers = "headers: {Content-Type: application/json}";
    }

    public void encrypt() {
        // Has some code to encrypt the content
    }

}
