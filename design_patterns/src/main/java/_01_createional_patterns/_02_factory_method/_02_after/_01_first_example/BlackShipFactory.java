package _01_createional_patterns._02_factory_method._02_after._01_first_example;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
