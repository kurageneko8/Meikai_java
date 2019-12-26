import java.util.Random;
import java.util.Scanner;

// package MeikaiJava.Chap06;

/**
 * IntArrayRand
 */
public class IntArrayRand {

   public static void main(String[] args) {
       Random rand = new Random();
       Scanner stdIn = new Scanner(System.in);

       System.out.print("cnt of elements:");
       int n= stdIn.nextInt();
       int[]a= new int[n];
       
       for(int i=0; i<n; i++){
           a[i] = 1+ rand.nextInt(10);// 1 to 10
       }
       for(int i = 0; i<n; i++){
           System.out.print("a["+ i + "] : ");
           for(int j = 0; j<a[i]; j++){
               System.out.print('*');
           }
           System.out.println();
       }
   } 
}