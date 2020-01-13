import java.util.Scanner;

// package MeikaiJava.Chap07;

/**
 * BitwiseOperation
 */
public class BitwiseOperation {

static void printBits(int x) {
    for (int i = 31; i  >= 0; i--) {
        System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
}
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.println("inpu 2 int.");
     System.out.print("a : ");
     int a = in.nextInt();
     System.out.print("b : ");
     int b = in.nextInt();

     System.out.print("a     = ");
     printBits(a);
     System.out.print("\nb     = ");
     printBits(b);
     System.out.print("\na & b = ");
     printBits(a & b);
     System.out.print("\na | b = ");
     printBits(a | b);
     System.out.print("\na ^ b = ");
     printBits(a ^ b);
     System.out.print("\n~a    = ");
     printBits(~a);
     System.out.print("\n~b    = ");
     printBits(~b);
 }

}