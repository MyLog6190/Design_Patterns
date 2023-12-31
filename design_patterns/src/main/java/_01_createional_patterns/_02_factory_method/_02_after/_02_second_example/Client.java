package _01_createional_patterns._02_factory_method._02_after._02_second_example;

public class Client {

    /*
     *   -- Factory Method Pattern--
     *
     *   Factory Method
     *   - 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
     *   - 요구사항에 따라 코드를 변경하지 않고 확장하기 쉽게 변경에 닫혀있고
     *     확장에 열려있도록 구현
     *
     *   구현
     *   - 인터페이스를 사용하여 구현 해야할 인스턴스를 추상 매소드로 정의한다.
     *   - 인터페이스에서 정의된 추상 매소드를 서브 클래스에서 구체적으로 구현한다.
     *   - 새로운 인스터스가 필요하다면 서브클래스를 추가하여 확장한다.
     *
     *   장점 : 결합도가 낮기 때문에 기존의 코드를 건드리지 않고 확장할 수 있다.
     *   단점 : 서클래스가 너무 많아진다.
     **/

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
