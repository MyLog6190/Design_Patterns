package _01_createional_patterns._01_singleton._02_how_to_break._02_second_method;

import java.io.*;

public class App {
   /*
   * 싱글톤을 깨트리는 방법2
   * - 직렬화 역직렬화
   * - 스트림을 사용해 파일화 하고 파일화한 다시 읽어서 새로운 인스턴스를 만든다.
   * */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        _01_createional_patterns._01_singleton._02_how_to_break._02_second_method.Settings settings = _01_createional_patterns._01_singleton._02_how_to_break._02_second_method.Settings.getInstance();
        _01_createional_patterns._01_singleton._02_how_to_break._02_second_method.Settings settings1;

        try(ObjectOutput out = new ObjectOutputStream( new FileOutputStream( "settings.obj" ) )) {
            out.writeObject(settings);
        }

        try(ObjectInput in = new ObjectInputStream( new FileInputStream( "settings.obj" ) )) {
            settings1 = (Settings) in.readObject();
        }
        System.out.println(settings == settings1);
    }
}
