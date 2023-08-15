package _01_createional_patterns._01_singleton._01_implement._02_second_example;

public class App {
    /*
        싱글톤 패턴(Singleton Pattern)
        - 인스턴스를 오직 하나의 인스턴스만 제공하는 클래스
    * */

    public static void main(String[] args) {
        _01_createional_patterns._01_singleton._01_implement._02_second_example.Settings settings = _01_createional_patterns._01_singleton._01_implement._02_second_example.Settings.getInstance();
        _01_createional_patterns._01_singleton._01_implement._02_second_example.Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1);
    }
}
