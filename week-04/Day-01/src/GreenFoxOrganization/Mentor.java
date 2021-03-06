package GreenFoxOrganization;

public class Mentor extends Person implements Cloneable {

  private String level;
 /* public enum level{
    junios,
    intermediate,
    senior
  }*/


  public Mentor() {
    this.level = "intermediate";
  }

/*  public String setLevel() {
    if (level == null){
      this.level= "intermediate";
    }else{
      this.level = level;
    }
    return level;
  }*/

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    if (level.equals(null)) {
      this.level = "intermediate";
    } else {
      this.level = level;
    }
  }


  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " "
        + level + " mentor.");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Mentor copy = new Mentor(this.name,this.age,this.gender,level);
    return copy;
  }
}
