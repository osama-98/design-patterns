package Creational.FactoryMethod.DialogExample;

import Creational.FactoryMethod.DialogExample.Buttons.Button;
import Creational.FactoryMethod.DialogExample.Creators.*;

public class Client {
    public static void main(String[] args) {
        renderButton(new WebDialog());
        renderButton(new WindowsDialog());
    }

    public static void renderButton(Dialog dialog) {
        Button button = dialog.createButton();
        button.render();
    }

    public static void clickButton(Dialog dialog) {
        Button button = dialog.createButton();
        button.onClick();
    }
}
