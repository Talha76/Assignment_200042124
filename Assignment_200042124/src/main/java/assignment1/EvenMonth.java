package assignment1;

public abstract class EvenMonth {

  public static MyCalendar nextDate(MyCalendar myCalendar) {
    MyCalendar result = new MyCalendar();
    result = myCalendar;
    if(myCalendar.date < 30) {
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
