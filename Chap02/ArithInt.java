// package MeikaiJava.Chap02;
import java.util.Scanner;

/**
 * ArithInt
 */
public class ArithInt {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.println("arithmetic of x and y");
        
        System.out.println("value of x:");
        int x = stdIn.nextInt();
        
        System.out.println("value of y:");
        int y = stdIn.nextInt();
        
        System.out.println("x+y=" + (x+y));
        System.out.println("x-y=" + (x-y));
        System.out.println("x*y=" + (x*y));
        System.out.println("x/y=" + (x/y));
        System.out.println("x%y=" + (x%y));
        
    }
}