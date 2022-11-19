package assignment2;

import assignment1.Student;

public class DataCoupling {

  public static boolean isEligibleForCitizenship(int age) {
    return age >= 18;
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "Talha";
    student.age = 20;

    System.out.println(isEligibleForCitizenship(student.age));
  }
}
/* -------------------- Explanation -----------------------
Here, the isEligibleForCitizen method used a data from the
student class. That's why here data coupling works.
 */