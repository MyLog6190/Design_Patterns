package _01_createional_patterns._02_factory_method._02_after._01_first_example;

public class Client {
    /*
    *   Factory Method
    *   - 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
    *   - 요구사항에 따라 코드를 변경하지 않고 확장하기 쉽게 변경에 닫혀있고
    *     확장에 열려있도록 구현
    **/
    public static void main(String[] args) {

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
