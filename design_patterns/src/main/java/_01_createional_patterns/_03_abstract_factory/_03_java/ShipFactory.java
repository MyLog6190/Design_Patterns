package _01_createional_patterns._03_abstract_factory._03_java;


import _01_createional_patterns._02_factory_method._02_after._02_second_example.Ship;
import _01_createional_patterns._02_factory_method._02_after._02_second_example.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
