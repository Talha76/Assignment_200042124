package assignment1;

public abstract class LeapMonth {

  private static boolean isLeapYear(int year) {
    if(year % 100 == 0)
      return year % 400 == 0;
    return year % 4 == 0;
  }
  public static MyCalendar nextDate(MyCalendar myCalendar) {
    MyCalendar result = new MyCalendar();
    result = myCalendar;
    if(myCalendar.date < 28) {
      result.date = myCalendar.date + 1;
      return result;
    }
    if(isLeapYear(myCalendar.year) && myCalendar.date < 29) {
      result.date = myCalendar.date + 1;
      return result;
    }
    if(myCalendar.month.ordinal() < 11) {
      result.date = 1;
      result.month = myCalendar.month.next();
      return result;
    }
    result.date = 1;
    result.month = myCalendar.month.next();
    result.year = myCalendar.year + 1;
    return result;
  }
}
