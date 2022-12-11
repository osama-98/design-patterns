package Creational.FactoryMethod.TransportExample.Creators;

import Creational.FactoryMethod.TransportExample.Transport.Ship;
import Creational.FactoryMethod.TransportExample.Transport.Transport;

public class ShipLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
