package Creational.FactoryMethod;

import Creational.FactoryMethod.Creators.JSONMessageCreator;
import Creational.FactoryMethod.Creators.MessageCreator;
import Creational.FactoryMethod.Creators.TextMessageCreator;
import Creational.FactoryMethod.Message.Message;

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
