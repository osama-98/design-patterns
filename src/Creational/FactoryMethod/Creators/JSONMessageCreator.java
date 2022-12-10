package Creational.FactoryMethod.Creators;

import Creational.FactoryMethod.Message.JSONMessage;
import Creational.FactoryMethod.Message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
