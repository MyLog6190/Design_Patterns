package _01_createional_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        /*
        * ArrayList를 복사할 떄 자주 사용 하는 방법
        * ArrayList는 Cloneable를 상속 받지만 List는 상속 받지 않는다.
        * 그래서 List는 clone()을 쓸 수 없어 ArrayList로 선언을 해야하기 때문에
        * 이 방법을 더 선호 한다.
        * */
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
