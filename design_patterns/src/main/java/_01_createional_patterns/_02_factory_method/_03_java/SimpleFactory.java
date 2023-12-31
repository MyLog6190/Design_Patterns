package _01_createional_patterns._02_factory_method._03_java;


import _01_createional_patterns._02_factory_method._02_after._02_second_example.Blackship;
import _01_createional_patterns._02_factory_method._02_after._02_second_example.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
