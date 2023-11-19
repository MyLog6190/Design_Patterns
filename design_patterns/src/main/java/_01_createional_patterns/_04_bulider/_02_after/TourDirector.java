package _01_createional_patterns._04_bulider._02_after;

import _01_createional_patterns._04_bulider._01_before.TourPlan;

import java.time.LocalDate;


/*
* TODO Director
*  - 구현한 빌더 클래스를 조립하여 객체 생성 하는 클래스
*  - 빌더 클래스에서 자주 쓰이는 조합을 메소드로 만들어 객체 생성을 할 수 있게 구현
* */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
