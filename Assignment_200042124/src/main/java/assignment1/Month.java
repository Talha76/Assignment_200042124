package assignment1;

public enum Month {
  January(1, "Jan"),
  February(2, "Feb"),
  March(1, "Mar"),
  April(0, "Apr"),
  May(1, "May"),
  June(0, "Jun"),
  July(1, "Jul"),
  August(1, "Aug"),
  September(0, "Sep"),
  October(1, "Oct"),
  November(0, "Nov"),
  December(1, "Dec");

  private final int monthParity;
  private final String name;

  Month(int parity, String name) { this.monthParity = parity; this.name = name; }

  public int getMonthParity() {
    return monthParity;
  }

  public String getName() { return name; }

  public static final Month[] names = values();
  public Month next() {
    return names[(this.ordinal() + 1) % names.length];
  }

}
