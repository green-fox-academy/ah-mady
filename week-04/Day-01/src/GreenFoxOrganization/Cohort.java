package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort implements Cloneable {

  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }


  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + ", cohort has " + students.size()
        + " students and " + mentors.size() + " mentors.");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Cohort copy = new Cohort("Stable Vetulus");
    return super.clone();
  }
}
