package assignment2;

import assignment1.Student;

public class StampCoupling {
  public boolean isEligibleForCitizenship(Student student) {
    return student.age >= 18;
  }
}
/* --------------- Explanation -----------------
In this code, we passed student type object. But,
we only needed the age of the student. This created
stamp coupling.
 */