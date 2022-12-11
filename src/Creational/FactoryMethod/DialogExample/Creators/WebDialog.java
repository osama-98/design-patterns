package Creational.FactoryMethod.DialogExample.Creators;

import Creational.FactoryMethod.DialogExample.Buttons.Button;
import Creational.FactoryMethod.DialogExample.Buttons.HtmlButton;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
