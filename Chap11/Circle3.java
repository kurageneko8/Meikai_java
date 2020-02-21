import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.System.in;
import static java.lang.System.out;

class Circle3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(in);

        out.println("get Area of Circle");
        out.print("radius:");
        double r = stdIn.nextDouble();
        out.println("Area:" + (PI * r * r) );

    }
}