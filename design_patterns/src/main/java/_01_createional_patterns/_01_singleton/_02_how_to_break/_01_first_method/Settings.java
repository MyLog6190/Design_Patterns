package _01_createional_patterns._01_singleton._02_how_to_break._01_first_method;

public class Settings {
    private Settings() {}

    private static class SettingHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }
}
