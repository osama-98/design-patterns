package Creational.FactoryMethod.DialogExample.Buttons;

public class WindowsButton  implements Button {
    @Override
    public void render() {
        System.out.println("The windows button has been rendered successfully");
    }

    @Override
    public void onClick() {
        System.out.println("The windows button has been clicked");
    }
}