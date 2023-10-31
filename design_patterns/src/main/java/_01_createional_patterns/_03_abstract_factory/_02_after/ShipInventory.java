package _01_createional_patterns._03_abstract_factory._02_after;

import _01_createional_patterns._03_abstract_factory._01_before.Ship;
import _01_createional_patterns._03_abstract_factory._01_before.ShipFactory;

public class ShipInventory {
    /*
    * Abstract Factory Pattern
    *
    *
    * Factory Method와 Abstract Factory Method 차이
    *
    * Factory Method
    * - 객체의 생성을 서브 클래스에서 처리하도록 캡슐화한다.
    * - 팩토리 메소드는 일반적으로 하나의 객체를 생성
    *
    * Abstract Factory Method
    * - 팩토리 패턴을 확장한 형대이다.
    * - 여러 객체들의 생성을 캡슐화하여 함께사용한다.
    * - 추상 팩토리 패턴으로 만든 객체를 조합하여 팩토리 매소드를 만들어 사용한다.
    *
    *
    *
    * */

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
