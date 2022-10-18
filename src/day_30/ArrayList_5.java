package day_30;

import java.util.ArrayList;

public class ArrayList_5 {
    // copy, contains(), containsAll
    public static void main(String[] args) {


        ArrayList<String> weekdays=new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

        ArrayList<String> allDays=new ArrayList<>(weekdays);
        System.out.println("allDays.get(0) = " + allDays.get(0));

//        ArrayList<String> alterDay = allDays;
//        alterDay.set(0,"Pazartesi");
//
//        System.out.println("after set pazartesi allDay.get(0) = " + allDays.get(0));

        allDays.add("Saturday");
        allDays.add("Sunday");

        System.out.println("allDays = " + allDays);

        System.out.println("allDays.containsTuesday = " + allDays.contains("Tuesday"));
        System.out.println("allDays.indexOfTuesday = " + allDays.indexOf("Tuesday"));
        System.out.println(allDays.get(1) == "Tuesday");
        System.out.println("allDays.get(1).equalsTuesday = " + allDays.get(1).equals("Tuesday"));

        System.out.println("allDays.contains(weekdays) = " + allDays.contains(weekdays));
        System.out.println("weekdays.containsAll(allDays) = " + weekdays.containsAll(allDays));




    }
}

