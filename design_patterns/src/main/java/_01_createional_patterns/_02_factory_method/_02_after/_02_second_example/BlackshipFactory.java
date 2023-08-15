package _01_createional_patterns._02_factory_method._02_after._02_second_example;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }

}
