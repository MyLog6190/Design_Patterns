package _01_createional_patterns._03_abstract_factory._02_after;

import _01_createional_patterns._03_abstract_factory._01_before.Ship;
import _01_createional_patterns._03_abstract_factory._01_before.ShipFactory;

public class ShipInventory {
    /*
    *
    *  -- Abstract Factory Pattern --
    * Abstract Factory
    * - 연관성 있는 객체들의 묶고 각자의 인터페이스를 생성하고 객체들을 각자 팩토리 패턴을 이용해 만들어 사용하는 패턴이다.
    * - 팩토리 패턴을 사용한 객체들을 묶어 함께 사용하는 패턴이다.
    *
    * 필요한 경우
    * - 여러 객체가 함께 사용되어야 하고, 이들 객체가 함께 동작하는 것이 중요한 경우에 추상 팩토리 패턴을 사용한다.
    * - 서로 다른 제품군을 생성해야 할 때 사용한다.
    * - 여러 팩토리 구현을 통해 다양한 환경(ex 운영체제)에서의 객체 생성을 처리할 때 사용한다.
    *
    * 구성 요소
    * - Abstract Factory : 관련된 객체를 묶어 정의한 인터페이스
    * - Concrete Factory : 추상 팩토리를 실제 구현하는 클래스
    * - Abstract Product : 추상 클래스가 생성할 객체의 인터페이스
    * - Concrete Product : 정의된 이터페이스를 구현하는 클래스
    *
    * 구현 방법
    * - 서로 연관된 객체를 묶어 추상 팩토리 인터페이스를 만든다.
    * - 인터페이스를 상속 받아 구체적인 패토리 클래스를 구현한다.
    * - 추상 팩토리에 사용될 객체의 인터페이스를 정의한다.
    * - 인터페이스를 상속 받아 구체적인 객체를 구현한다.
    * - 만든 객체들을 팩토리 클래스에서 생성 후 반환한다.
    * - 클라이언트에서 사용할 팩토리 클래스를 호출하여 사용한다.
    *
    * 장점
    * - 관련 객체들을 한께 사용할 때 일관성 있는 방법으로 객체를 생성할 수 있다.
    * - 인터페이스를 유지한 채로 다양한 환경에서 사용 가능하도록 만들 수 있다.
    *
    * 단점
    * - 클래스가 증가하면서 코드 양이 증가하고 복잡도가 올라간다.
    *
    * -- Factory Method와 Abstract Factory Method 차이 --
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
    * */

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
