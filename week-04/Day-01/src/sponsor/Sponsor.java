package sponsor;

import person.Person;

public class Sponsor extends Person {

  public String company;
  int hiredStudents;

  public Sponsor(){
    this.company = "Google";
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sponsor(String name, int age, String gender, String company){
    super(name,age,gender);
    this.company=company;
    this.hiredStudents = 0;
  }

  @Override
  public void introduce(){
    String introduction = "Hi, I'm " + name + ", a " + age + " years old "
        + gender + " who represents " + company + " and hired " + hiredStudents
        + " students so far.";
    System.out.println(introduction);
  }

  public void hire(){
    hiredStudents+=1;
  }

  @Override
  public void getGoal(){
    String goal = "My goal is: Hire brilliant junior software developers.";
    System.out.println(goal);
  }

}
