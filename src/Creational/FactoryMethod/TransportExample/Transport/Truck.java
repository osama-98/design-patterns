package Creational.FactoryMethod.TransportExample.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Start truck delivery");
    }
}
