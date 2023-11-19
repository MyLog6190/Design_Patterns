package _01_createional_patterns._02_factory_method._02_after._01_first_example;

public class Client {
    /*
    *   -- Factory Method Pattern --
    *
    *   Factory Method
    *   - 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
    *   - 요구사항에 따라 코드를 변경하지 않고 확장하기 쉽게 변경에 닫혀있고
    *     확장에 열려있도록 구현
    *
    *   필요한 경우
    *   - 객체를 생성하는 로직이 복잡하거나, 다양한 종류의 객체를 생성해야 하는 경우 팩토리 패턴이 유용하다.
    *   - 객체를 생성하는 방법이 변경될 가능성이 있는 경우, 팩토리 패턴을 사용하면 기존 코드에 영향을 최소화하면서
    *     새로운 객체 생성 방법을 추가할 수 있다.
    *   - 객체 생성을 중앙에서 관리하고, 필요에 따라 생성 방법을 변경하고자 할 때 팩토리 패턴이 유용하다.
    *
    *   구성 요소
    *   - Product : 팩토리 패턴으로 생성되는 객체의 공통 부분을 인터페이스로 정의 한다.
    *   - ConcreateProduct : 정의한 인터페이스를 실제로 구현하는 클래스
    *   - Creator : 객체 생성을 담당하는 인터페이스를 정의
    *   - ConcreteCreator : 인터페이스의 정의된 팩토리 메소드를 객체를 생성
    *
    *   구현
    *   - 팩토리 메소드 패턴을 적용하여 생성할 객체의 인터페이스(Creator)를 정의한다.
    *   - 정의한 인터페이스를 서브클래스(ConcreteCreator)에서 구체적으로 구현한다.
    *   - 서브클래스에서 구현된 객체(Product)를 생성하고 반환한다.
    *
    *   장점
    *   - 결합도가 낮기 때문에 기존의 코드를 건드리지 않고 확장할 수 있다.
    *   - 유지보수가 용이하다.
    *
    *   단점
    *   - 서브클래스가 늘어나면서 코드가 복잡해 질 수 있다..
    *   - 클래스가 늘어나면서 코드 양이 많아진다.
    **/


    public static void main(String[] args) {

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
