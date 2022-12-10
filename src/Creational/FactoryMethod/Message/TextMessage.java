package Creational.FactoryMethod.Message;

import java.util.Arrays;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		String[] message = new String[2];
		message[0] = "message: 'this is a text message'";

		if (!this.headers.isEmpty()) {
			message[1] = this.headers;
		}

		return Arrays.toString(message);
	}
}
