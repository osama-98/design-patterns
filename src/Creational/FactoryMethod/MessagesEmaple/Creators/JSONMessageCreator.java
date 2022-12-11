package Creational.FactoryMethod.MessagesEmaple.Creators;

import Creational.FactoryMethod.MessagesEmaple.Message.JSONMessage;
import Creational.FactoryMethod.MessagesEmaple.Message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
