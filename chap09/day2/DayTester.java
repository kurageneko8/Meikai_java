import java.util.Scanner;

class DayTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input day1");
        
        System.out.print("Y: ");
        int y = in.nextInt();

        System.out.print("M: ");
        int m = in.nextInt();

        System.out.print("D: ");
        int d = in.nextInt();

        Day day1 = new Day(y, m, d);
        System.out.println("day1 = " + day1);
        

        Day day2 = new Day(day1);
        System.out.println("day2 is made as same date with day1 ");
        System.out.println("day2= "+ day2);

        if (day1.quealTo(day2)) {
            System.out.println("day1 is same with day2");
        } else {
            System.out.println("day1 is not same with day2");
        }

        Day d1 = new Day();
        Day d2 = new Day(2010);
        Day d3 = new Day(2010, 10);
        Day d4 = new Day(2010, 10, 15);

        System.out.println("d1  = " + d1);
        System.out.println("d2  = " + d2);
        System.out.println("d3  = " + d3);
        System.out.println("d4  = " + d4);

        Day[] a = new Day[3];
        for(int i = 0; i < a.length; i++) {
            a[i] = new Day();
        }

        for(int i=0; i < a.length; i++) {
            System.out.println("a["+ i +"] = " + a[i]);
        }
    }
}