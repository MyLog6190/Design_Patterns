package _01_createional_patterns._01_singleton._01_implement._02_the_second_method;

public class Settings {
    /*
     * 방법2
     * - Synchronized
     * - 동기화 처리를 통에 멀티쓰래드가 동시에 접속 하지 못하게 하여
     *   인스턴스가 중복 생성 되지 않도록 한다.
     *
     * 문제점
     * - getInstance를 호출 할 때마다 동기화 처리 작업을 하기 때문에 성능이 저하된다.
     * */

    private static Settings instance;
    private Settings() {}

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
