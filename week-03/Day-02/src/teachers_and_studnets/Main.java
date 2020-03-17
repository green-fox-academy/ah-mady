package teachers_and_studnets;

public class Main {
  public static void main(String[] args) {
    Student ahmed = new Student();
    Teacher pityu = new Teacher();

    ahmed.question(pityu);
    pityu.teach(ahmed);
  }

}
