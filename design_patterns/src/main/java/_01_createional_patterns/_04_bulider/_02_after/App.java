package _01_createional_patterns._04_bulider._02_after;


import _01_createional_patterns._04_bulider._01_before.TourPlan;

public class App {
    /*
    * Builder Pattern
    * - 객체 생성을 단순화하고 가독성을 향상시키기 위한 패턴이며 객체 생성이 복잡하거나,
    *   생성자만 사용할 때 생기는 문제를 해결하기 위해 사용되는 패턴이다.
    *
    * Builder Pattern 필요한 경우
    * - 많은 수의 매개변수를 가진 생성자를 사용하면 코드를 읽기 어려울 수 있다.
    * */
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder2().newInstance());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
