package _01_createional_patterns._01_singleton._01_implement._01_the_first_method;

public class Settings {
    /*
    * 방법1
    * - 기본 생성자를 private 키워드를 사용하여 다른 클래서에서 생성하지 못하게 한다
    * - getInstance 매소드에서 Settings 클래스의 instance 없다면  Settings 클래스의 인스턴스를 생성하고
    *   인스턴스가 이미 생성되어 있다면 새로 인스턴스를 생성하지 않고 그대로 사용한다.
    *
    * 문제점
    * - 멀티쓰레드 환경에서 실행하면 서로 다른 인스턴스가 생성될 수 있음
    * - 멀티쓰레드 환경에서 안전하지 않지 못한 방법
    * */

    private static Settings instance;
    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
