package _01_createional_patterns._02_factory_method._02_after._01_first_example;

/*
 * TODO ConcreteCreator(Factory Class)
 *  - Creator 서브클래스이며 구체적인 구현을 하는 클래스
 *  - 어떤 Product 객체를 생성할 지 결정하는 팩토리 클래스이다.
 * */

public class WhiteshipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
