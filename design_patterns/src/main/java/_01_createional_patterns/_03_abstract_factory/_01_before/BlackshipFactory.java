package _01_createional_patterns._03_abstract_factory._01_before;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }

}
