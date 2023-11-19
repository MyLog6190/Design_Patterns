package _01_createional_patterns._02_factory_method._02_after._01_first_example;

/*
 * TODO ConcreteCreator
 *  -
 * */

public class WhiteshipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
