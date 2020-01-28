import java.util.Scanner;

/**
 * DayTester
 */
class DayTester {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int y, m, d;
        
        System.out.print("wetern year:");
        y = in.nextInt();
        System.out.println("the year is " + (Day.isLeap(y)? "" : "not ") + "a leap year");

        System.out.println("input date");
        System.out.println("Y:");
        y = in.nextInt();
        System.out.println("M:");
        m = in.nextInt();
        System.out.println("D:");
        d = in.nextInt();
        Day a = new Day(y, m, d);
        System.out.println(a.getYear() + " is " + (a.isLeap()? "" : "not ") + "a leap year");
        
        
    }
}