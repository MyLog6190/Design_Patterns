package _01_createional_patterns._04_bulider._02_after;

import _01_createional_patterns._04_bulider._01_before.TourPlan;

import java.time.LocalDate;

/*
* TODO Builder
*  - 빌더 객체를 생성하기 위한 인터페이스
*  - 객체의 부분을 생성하고 조립할 메서드를 정의
* */
public interface  TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
