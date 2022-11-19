package assignment2;

import assignment1.Student;

public class ControlCoupling {
  public boolean isEligibleForCitizenship(int age) {
    return age >= 18;
  }

  public void makeCitizen(Student student) {
    if(isEligibleForCitizenship(student.age))
      System.out.println(student.name + " is now a citizen.");
    else
      System.out.println(student.name + " is not eligible for citizenship.");
  }
}
