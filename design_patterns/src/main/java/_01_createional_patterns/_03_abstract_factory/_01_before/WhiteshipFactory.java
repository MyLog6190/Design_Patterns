package _01_createional_patterns._03_abstract_factory._01_before;

import _01_createional_patterns._03_abstract_factory._02_after.WhiteshipPartsFactory;

public class WhiteshipFactory extends DefaultShipFactory {


    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
