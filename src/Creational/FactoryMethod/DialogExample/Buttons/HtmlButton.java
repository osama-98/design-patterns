package Creational.FactoryMethod.DialogExample.Buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("The html button has been rendered successfully");
    }

    @Override
    public void onClick() {
        System.out.println("The html button has been clicked");
    }
}
