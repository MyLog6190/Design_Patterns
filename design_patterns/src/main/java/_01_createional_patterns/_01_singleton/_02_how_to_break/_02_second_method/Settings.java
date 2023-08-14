package _01_createional_patterns._01_singleton._02_how_to_break._02_second_method;

public class Settings {
    private Settings() {}

    private static class SettingHolder {
        private static final Settings INSTANCE = new  Settings();
    }

    public static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }

    // 역직렬화 할 때 사용되는 매소드
    // 이 매소드를 오버라이드를 하여 막을 수 있다.
    protected Object readResolve() {
        return getInstance();
    }
}
