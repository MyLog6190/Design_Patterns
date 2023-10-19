package _01_createional_patterns._04_bulider._02_after;

import _01_createional_patterns._04_bulider._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;

public class DefaultTourBuilder2 implements TourPlanBuilder {

    private TourPlan tourPlan;

    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }


    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null) {
            this.tourPlan.setPlans(new ArrayList<>());
        }

        this.tourPlan.addPlan(day, plan);
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
