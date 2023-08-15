package _01_createional_patterns._02_factory_method._02_after._02_second_example;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    void sendEmailTo(String email, Ship ship);

    Ship createShip();

    void validate(String name, String email);

    void prepareFor(String name);

}
