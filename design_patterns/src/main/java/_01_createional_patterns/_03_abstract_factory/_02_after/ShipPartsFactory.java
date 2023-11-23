package _01_createional_patterns._03_abstract_factory._02_after;

/*
* TODO Abstract Factory
*  - 관련된 객체를 묶어 같이 생성하도록 인터페이스를 정의한다.
*  - 구체적인 구현을 서브 클래스에서 구현한다.
* */

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
