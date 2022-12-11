package Creational.FactoryMethod.TransportExample;

import Creational.FactoryMethod.TransportExample.Creators.Logistics;
import Creational.FactoryMethod.TransportExample.Creators.RoadLogistics;
import Creational.FactoryMethod.TransportExample.Creators.ShipLogistics;
import Creational.FactoryMethod.TransportExample.Transport.Transport;

public class Client {
    public static void main(String[] args) {
        startDelivery(new RoadLogistics());
        startDelivery(new ShipLogistics());
    }

    public static void startDelivery(Logistics logistics) {
        Transport transport = logistics.createTransport();
        transport.deliver();
    }
}
