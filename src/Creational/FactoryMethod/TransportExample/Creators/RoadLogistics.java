package Creational.FactoryMethod.TransportExample.Creators;

import Creational.FactoryMethod.TransportExample.Transport.Transport;
import Creational.FactoryMethod.TransportExample.Transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
