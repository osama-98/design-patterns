package Creational.FactoryMethod.TransportExample.Creators;

import Creational.FactoryMethod.TransportExample.Transport.Transport;

public abstract class Logistics {
    public void planDelivery() {
    }

    public abstract Transport createTransport();
}
