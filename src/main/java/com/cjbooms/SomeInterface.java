package com.cjbooms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public interface SomeInterface {


    void setSomeDate(LocalDate localDate);

    default void setSomeDateInDayMonthYear(String dayMonthYear) {
        setSomeDate(LocalDate.parse(dayMonthYear, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
