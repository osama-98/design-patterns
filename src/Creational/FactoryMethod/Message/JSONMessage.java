package Creational.FactoryMethod.Message;

import java.util.Arrays;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
		String[] message = new String[2];
		message[0] = "{message: 'this is a json message'";

		if (!this.headers.isEmpty()) {
			message[1] = (this.headers + "}");
		} else {
			message[0] += "}";
		}

        return Arrays.toString(message);
    }

}
