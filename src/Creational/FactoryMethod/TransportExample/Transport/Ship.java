package Creational.FactoryMethod.TransportExample.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Start ship delivery");
    }
}
