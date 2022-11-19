package assignment1;

public class MyCalendar {
  public int date;
  public Month month;
  public int year;

  public MyCalendar() {}

  public MyCalendar(int date, Month month, int year) {
    this.date = date;
    this.month = month;
    this.year = year;
  }

  public String getDate() {
    return date + "-" + month.getName() + "-" + year;
  }

  public MyCalendar nextDate() {
    if(this.month.getMonthParity() == 0)
      return EvenMonth.nextDate(this);
    if(this.month.getMonthParity() == 1)
      return OddMonth.nextDate(this);
    return LeapMonth.nextDate(this);
  }
}
