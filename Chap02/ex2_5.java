import java.util.Scanner;

class ex2_5 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("x's value:");
        float x = stdIn.nextFloat();

        System.out.print("y's value:");
        float y = stdIn.nextFloat();

        System.out.println("sum:"+ (x+y));
        System.out.println("ave:"+ (x+y)/2);
    }
}