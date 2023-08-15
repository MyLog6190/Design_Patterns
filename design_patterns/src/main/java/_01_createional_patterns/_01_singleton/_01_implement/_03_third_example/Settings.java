package _01_createional_patterns._01_singleton._01_implement._03_third_example;

public class Settings {
    /*
     * 방법3
     * - 이른 초기화(eager initialization)
     * - 클래스에서 인스턴스를 바로 생성
     *
     * 문제점
     * - static은 프로그램 종료되기 전까지 메모리를 할당 받는다.
     * - static 변수는 class가 로드되면 바로 static 영역에 할당된다.
     * - 인스턴스를 사용하지 않아도 미리 인스턴스를 생성하기 때문에 자원이 낭비된다.
     * - 인스턴스 생성에 자원이 많이 사용되면 비효율적인 방법
     * */

    private static final Settings INSTANCE = new Settings();
    private Settings() {}

    public static Settings getInstance() {
        return INSTANCE;
    }
}
