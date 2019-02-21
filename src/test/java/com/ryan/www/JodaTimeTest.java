package com.ryan.www;

import org.joda.time.DateTimeComparator;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Ryan on 2019/1/23.
 */
public class JodaTimeTest {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.add(1,1);
        DateTimeComparator instance = DateTimeComparator.getInstance();
        int compare = instance.compare(date, calendar);
        System.out.println(compare);
    }
}
