package com.cjbooms;


import java.time.LocalDate;

public class SomeFailingImplementation implements SomeInterface {

    private LocalDate localDate;

    @Override
    public void setSomeDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
