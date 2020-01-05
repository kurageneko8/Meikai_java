import java.util.Scanner;

/**
 * DayTester
 */
public class DayTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] wd = {"sun", "tues", "wednes", "thurs", "Fri", "Satur" };

        System.out.println("input Birthday by western calendar.");
        System.out.print("Year:");
        int y = in.nextInt();
        System.out.print("Month:");
        int m = in.nextInt();
        System.out.print("Day:");
        int d = in.nextInt();

        Day birthday = new Day(y,m,d);

        System.out.println("your Birthday "
        + birthday.getYear() + "/"
        + birthday.getMonth() + "/"
        + birthday.getDate() + " is "
        + wd[birthday.dayOfWeek()] + "day."
        );
        
    }
}