import assignment1.Month;
import assignment1.MyCalendar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Assignment1Test {

  @Test
  void testNormalDate() {
    MyCalendar calendar = new MyCalendar(1, Month.January, 2000);
    assertEquals("2-Jan-2000", calendar.nextDate().getDate());
    assertNotEquals("4-Jan-2000", calendar.nextDate().getDate());
  }

  @Test
  void testEndingDate() {
    MyCalendar calendar = new MyCalendar(31, Month.January, 2001);
    assertEquals("1-Feb-2001", calendar.nextDate().getDate());
    calendar.date = 28; calendar.month = Month.February;
    assertEquals("1-Mar-2001", calendar.nextDate().getDate());
  }

  @Test
  void testLeapYear() {
    MyCalendar calendar = new MyCalendar(28, Month.February, 2000);
    assertEquals("29-Feb-2000", calendar.nextDate().getDate());
  }

  @Test
  void nextYear() {
    MyCalendar calendar = new MyCalendar(31, Month.December, 2000);
    assertEquals("1-Jan-2001", calendar.nextDate().getDate());
  }

}
