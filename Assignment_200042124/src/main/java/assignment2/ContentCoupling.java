package assignment2;

import assignment1.Student;

public class ContentCoupling {
  public void changeName(Student student, String newName) {
    student.name = newName;
  }
}
/* ----------- Explanation -------------
The changeName method changes the name of
the student passed as the argument to the
method.
 */