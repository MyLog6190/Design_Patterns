package _01_createional_patterns._01_singleton._01_implement._05_fifth_example;

public class Settings {
    /*
     * 방법5
     * - inner class
     * - class안에 인스턴스를 생성하는 inner class를 만든다.
     * - 인스턴스 호출 매소드에 inner class에서 만든 인스턴스를 리턴 값으로 준다.
     * */

    private Settings() {}

    // 2. SettingHolder class가 로딩되면서 INSTANCE가 생성되면서 static에 올라간다.
    private static class SettingHolder {
        private static final Settings INSTANCE = new Settings();
    }

    // 1. getInstance가 호출되면 SettingHolder class를 로드한다.
    // 3. 생성된 SettingHolder의 INSTANCE를 리턴한다.
    public static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }
}
