package com.example.spring2.handlers;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AgeHandler {
    public static Integer calculateAge(Integer day,Integer month, Integer year) {
        Period age;
        try {
            LocalDate date = LocalDate.of(year,month,day);
            age = Period.between(date, LocalDate.now());
            return age.getYears();
        } catch (Exception e){
            return 0;
        }
    }


}
