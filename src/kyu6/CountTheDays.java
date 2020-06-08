/* Little Annie is very excited for upcoming events. She want's to know how
many days she have to wait for a specific event.
Your job is to help her out.
Task: Write a function which returns the number of days from today till
the given date. The function will take a Date object as parameter. You have
to round the amount of days.
If the event is in the past, return "The day is in the past!"
If the event is today, return "Today is the day!"
Else, return "x days"
 */

import java.util.Date;

public class CountTheDays {

    public String countDays(Date d){
        long days = (d.getTime() - System.currentTimeMillis()) / 86400000;
        return days < 0 ? "The day is in the past!" : days > 0 ? days + " days" : "Today is the day!";
    }
}

//Second solution
 /*
 import java.util.Date;

 import java.util.concurrent.TimeUnit;

 public class Day{

     public static String countDays(Date d){
         Date now = new Date();
         if (now.equals(d)) return "Today is the day!";
         else if (now.after(d)) return "The day is in the past!";
         else return TimeUnit.DAYS.convert(d.getTime() - now.getTime(), TimeUnit.MILLISECONDS) + " days";
     }
 }
  */

