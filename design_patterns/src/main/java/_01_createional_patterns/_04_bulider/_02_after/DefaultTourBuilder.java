package _01_createional_patterns._04_bulider._02_after;

import _01_createional_patterns._04_bulider._01_before.DetailPlan;
import _01_createional_patterns._04_bulider._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
*  ConcreateBuilder
*  - 빌더를 구체적으로 구현하는 클래스
*  - 인터페이스에서 정의한 매개변수들을 사용할 수 있도록 맴버변수로 사용
*  - this를 리턴하여 사용하고자 하는 메소드를 조합하여 사용한다.
* */
public class DefaultTourBuilder implements TourPlanBuilder {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}
