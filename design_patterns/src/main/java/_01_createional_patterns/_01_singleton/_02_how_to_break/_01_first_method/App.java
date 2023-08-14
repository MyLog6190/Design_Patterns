package _01_createional_patterns._01_singleton._02_how_to_break._01_first_method;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
   /*
   * 싱글톤을 깨트리는 방법1
   * - reflection을 사용
   * - reflection 클래스, 인터페이스, 메소드등의 정보를 가져온다.
   * - reflection 사용하면 private에도 접근이 가능
    * */

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.getInstance();
        // 리플렉션을 사용하여 접근 가능

        // settings의 정보를 가져온다
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();

        // public이 아닌 접근제한자 접근을 하고 싶다면 setAccessible()에 true값을 전달
        constructor.setAccessible(true);

        // reflection으로 가져온 setting class의 정보로 새로운 인스턴스를 생성
        Settings settings1 = constructor.newInstance();

        System.out.println( settings == settings1 );
    }
}
