package _01_createional_patterns._01_singleton._01_implement._04_the_fourth_method;

public class Settings {
    /*
     * 방법4
     * - double checked locking
     * - getInstance 매소드를 호출 했을 떄 인스턴스가 생성 되어 있지 않았을 때 동기화 처리를하여
     *   쓰레드에 동시 접근을 막고 다시 인스턴스가 생성되어 있는지 확인하고 생생 되어 있지 않다면 인스턴스를 생성한다.
     *
     * - getInstance 매소드에 synchronized 사용하면 getInstance 호출 할 때마다 동기화 처리를하지만
     *   double checked locking 방법을 쓰면 getInstance를 호출하고 인스턴스가 생성되지 않았을 때만
     *   동기화 처리를 하기 때문에 더 효율적이다.
     *
     * 문제점
     * - volatile를 이해하고 사용하기에 어렵다.
     * - 자바 1.5이상의 버전에서만 사용가능하다.
     * - 코드가 복잡해 진다.
     * */

    private static volatile Settings instance;
    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            // 쓰레드가 동시에 접근하더라도
            // 먼저 들어온 쓰레드가 synchronized 블럭에 들어가 있으면
            // 다른 쓰레드는 대기하고 있어야 한다.
            synchronized (Settings.class) {
                // 먼저 들어온 쓰레드가 인스턴스를 생성하고 나가면
                // 대기하고 있던 쓰레드가 synchronized 블럭에 들어와도
                // 인스턴스가 이미 생성되어 있기 때문에 if문은 건너뀐다.
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
