package _01_createional_patterns._03_abstract_factory._01_before;

import _01_createional_patterns._02_factory_method._02_after._02_second_example.DefaultShipFactory;
import _01_createional_patterns._02_factory_method._02_after._02_second_example.Ship;
import _01_createional_patterns._02_factory_method._02_after._02_second_example.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
