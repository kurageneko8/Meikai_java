import java.util.Scanner;
import static java.lang.Math.PI;

class Circle2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("get Area of Circle");
        System.out.print("radius:");
        double r = stdIn.nextDouble();
        System.out.println("Area:" + (PI * r * r) );

    }
}