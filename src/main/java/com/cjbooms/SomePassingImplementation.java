package com.cjbooms;


import java.time.LocalDate;

public class SomePassingImplementation implements SomeInterface {

    private LocalDate localDate;

    @Override
    public void setSomeDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public void setSomeDateInDayMonthYear(String dayMonthYear) {
        SomeInterface.super.setSomeDateInDayMonthYear(dayMonthYear);
    }
}
