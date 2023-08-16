package _01_createional_patterns._03_abstract_factory._02_after;

import _01_createional_patterns._02_factory_method._02_after._02_second_example.Ship;
import _01_createional_patterns._02_factory_method._02_after._02_second_example.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
