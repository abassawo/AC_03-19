package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/19/15.
 */
import java.util.Calendar;
import java.util.Scanner;
public class BirthdayCalculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        Calendar rightNow = Calendar.getInstance();
        int currentYear = rightNow.get(Calendar.YEAR);
        int currentMonth = rightNow.get(Calendar.MONTH);
        int currentDay = rightNow.get(Calendar.DATE);
        int dayOfYear = rightNow.get(Calendar.DAY_OF_YEAR);
        int bMonth = 0;
        int bDay = 0;

        Calendar bDayCal = Calendar.getInstance();
        int daysLeft;

        System.out.println("Please enter your birthday");
        System.out.println("What is the month? (1-12)");
        bMonth = Input.nextInt();
        System.out.println("What is the day? (1-31) ");
        bDay = Input.nextInt();
        bDayCal.set(currentYear, bMonth - 1, bDay);   //because java counts from 0.

        int bDay_dayOfYear = bDayCal.get(Calendar.DAY_OF_YEAR);
        daysLeft= bDay_dayOfYear - dayOfYear;
        System.out.println("There are " + daysLeft + " days left until your birthday");

    }
}
