package _01_createional_patterns._03_abstract_factory._01_before;

public abstract class DefaultShipFactory implements ShipFactory {
    /*
    *   자바 8버전은 인터페이스에 private를 사용할 수 없기 때문에
    *   추상클래스를 따로 만들어 사용한다
    * */

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
