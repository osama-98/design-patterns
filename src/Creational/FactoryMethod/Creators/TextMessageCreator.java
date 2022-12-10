package Creational.FactoryMethod.Creators;

import Creational.FactoryMethod.Message.Message;
import Creational.FactoryMethod.Message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
