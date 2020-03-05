import java.text.DecimalFormat;

public class CodingHours {
    public static void main(String[] args) {
        int hoursPerDay = 6;
        int daysPerWeek = 5;
        int hoursPerWeek = hoursPerDay * daysPerWeek;
        System.out.println("Attendee at GreenFox spends " + (hoursPerWeek * 17) + " hours for whole semester in weekdays only.");

        float hoursPerSemester = 24 * 7 * 17;
        int codeHoursPerSemester = 52 * 17;

        double percentage = (codeHoursPerSemester / hoursPerSemester) * 100;
        DecimalFormat formatter = new DecimalFormat("#0.00");



        System.out.println("Percentage of the coding hours is " + formatter.format(percentage) + " %");

    }
}
