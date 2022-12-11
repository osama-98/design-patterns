package Creational.FactoryMethod.DialogExample.Creators;

import Creational.FactoryMethod.DialogExample.Buttons.Button;
import Creational.FactoryMethod.DialogExample.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
