import java.util.Scanner;

class ex2_6 {
    public static void main (String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("calculate the area of triangle");
        System.out.print("bottom:");
        float x = stdIn.nextFloat();

        System.out.print("height:");
        float y = stdIn.nextFloat();

        System.out.println("area:"+ (x*y)/2);
    }
}