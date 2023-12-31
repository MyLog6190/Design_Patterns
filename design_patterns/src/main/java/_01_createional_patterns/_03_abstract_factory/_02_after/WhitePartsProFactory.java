package _01_createional_patterns._03_abstract_factory._02_after;

/*
*  Concrete Factory
*  - Abstract Factory를 정의한 실제로 구현하는 클래스
*  - 어떤 객체를 생성할 지 결정한다.
* */

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
