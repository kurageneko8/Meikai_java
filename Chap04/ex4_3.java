import java.util.Scanner;

// package MeikaiJava.Chap04;

/**
 * ex4_3
 */
public class ex4_3 {

   public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);

       System.out.print("int A:");
       int a = stdIn.nextInt();

       System.out.print("int B:");
       int b = stdIn.nextInt();

       int big;
       int small;
        if (a > b) {
            big = a;
            small = b;
        } else if (a < b) {
            big = b;
            small = a;
        } else {
            big = 1;
            small = 1;
        }
       
        if (big == small) {
            
        } else {

            do {
                System.out.print(big);
                System.out.print(" ");
                big--;
            } while (big != small);
        }
       
   } 
}