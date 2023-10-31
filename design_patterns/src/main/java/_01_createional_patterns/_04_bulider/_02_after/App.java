package _01_createional_patterns._04_bulider._02_after;


import _01_createional_patterns._04_bulider._01_before.TourPlan;

public class App {
    /*
    * Builder Pattern
    * - 객체 생성이 복잡하거나 여러
    *
    * */
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder2().newInstance());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
