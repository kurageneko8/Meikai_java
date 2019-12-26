import java.util.Random;
import java.util.Scanner;

// package MeikaiJava.Chap04;

/**
 * ex4_2
 */
public class ex4_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(90) + 10;

        System.out.println("guess the number between 10 to 99");

        int x;
        do {
            System.out.print("input number:");
            x = stdIn.nextInt();

            if (x>no) {
                System.out.println("the num  is smaller");
            } else if (x<no) {
                
                System.out.println("the num  is bigger");
            }
        } while (x != no);

        System.out.print("collect!!");
    }
    
}