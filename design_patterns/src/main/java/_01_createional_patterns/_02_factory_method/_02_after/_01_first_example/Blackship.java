package _01_createional_patterns._02_factory_method._02_after._01_first_example;

/*
*  ConcreteProduct
*  - 팩토리 클래스에서 생성되는 객체
* */

public class Blackship extends Ship{

    public Blackship() {
        setName("blackship");
        setColor("black");
        setLogo("⚓");
    }

}
