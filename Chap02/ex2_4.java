import java.util.Scanner;

// package MeikaiJava.Chap02;

/**
 * ex2_5
 */
public class ex2_5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int x = stdIn.nextInt();

        System.out.println("10を加えた値は" + (x + 10) + "です。");
        System.out.println("10を減じた値は" + (x - 10) + "です。");
        System.out.println("10をmultiple値は" + (x * 10) + "です。");

    }
}