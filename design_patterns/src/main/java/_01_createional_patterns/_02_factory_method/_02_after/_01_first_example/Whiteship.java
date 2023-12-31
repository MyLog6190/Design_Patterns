package _01_createional_patterns._02_factory_method._02_after._01_first_example;

/*
 *  ConcreteProduct
 *  - 팩토리 클래스에서 생성되는 객체
 * */

public class Whiteship extends Ship {

    public Whiteship() {
        setName("whiteship");
        setLogo("\uD83D\uDEE5");
        setColor("white");
    }

}
