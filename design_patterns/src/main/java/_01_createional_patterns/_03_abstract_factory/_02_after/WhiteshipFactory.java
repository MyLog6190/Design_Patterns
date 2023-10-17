package _01_createional_patterns._03_abstract_factory._02_after;

import _01_createional_patterns._03_abstract_factory._01_before.DefaultShipFactory;
import _01_createional_patterns._03_abstract_factory._01_before.Ship;
import _01_createional_patterns._03_abstract_factory._01_before.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
