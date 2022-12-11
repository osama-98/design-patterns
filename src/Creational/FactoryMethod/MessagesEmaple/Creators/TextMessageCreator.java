package Creational.FactoryMethod.MessagesEmaple.Creators;

import Creational.FactoryMethod.MessagesEmaple.Message.Message;
import Creational.FactoryMethod.MessagesEmaple.Message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
