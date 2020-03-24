package GreenFoxOrganization;

public class Student extends Person implements Cloneable {

  public String previousOrganization;
  public int skippedDays;

  public Student(){
    this("Jane Doe", 30 , "female", "The school of life");
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization){
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  @Override
  public void getGoal(){
    String goal =  "My goal is: Be a junior software developer.";
    System.out.println(goal);
  }

  @Override
  public void introduce(){
    String introduction = "Hi I'm "+ name + ", a " + age + " years old " + gender
        + " from " + previousOrganization + " who skipped " + skippedDays
        + " days from the course already.";
    System.out.println(introduction);
  }

  public void skipDays(int numberOfDays) {
    skippedDays+=numberOfDays;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Student copy = new Student(this.name,this.age,this.gender,previousOrganization);
    return copy;
  }
}
