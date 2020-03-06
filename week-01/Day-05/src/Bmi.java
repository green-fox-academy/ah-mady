import java.text.DecimalFormat;
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        DecimalFormat myFormat = new DecimalFormat("#0.00");
        double bMI= massInKg/(heightInM*heightInM);
        System.out.println("BMI is: " + myFormat.format(bMI));
    }
}
