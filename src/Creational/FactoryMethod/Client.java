package Creational.FactoryMethod;

import Creational.FactoryMethod.Creators.JSONMessageCreator;
import Creational.FactoryMethod.Creators.MessageCreator;
import Creational.FactoryMethod.Message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message);
	}
}
