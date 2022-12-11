package Creational.FactoryMethod.MessagesEmaple;

import Creational.FactoryMethod.MessagesEmaple.Creators.*;
import Creational.FactoryMethod.MessagesEmaple.Message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}

	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message.getContent());
	}
}
