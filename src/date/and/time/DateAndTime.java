package src.date.and.time;


import java.util.Date;

public class DateAndTime {

  public static String findDay(int month, int day, int year) {
    Date date = new Date(year-1900, month -1, day);
    int dayOfWeek = date.getDay();
    String dayName = new String();
    switch (dayOfWeek) {
      case 0:
        dayName = "Sunday";
        break;
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
    }
    return dayName;
  }


  public static void main(String[] args) {
    System.out.println(findDay(8,05,2015));
  }
}
