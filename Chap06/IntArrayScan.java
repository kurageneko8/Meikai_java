import java.util.Scanner;

// package MeikaiJava.Chap06;

/**
 * IntArrayScan
 */
public class IntArrayScan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("count number of element:");
        int n = in.nextInt();
        int[] a = new int[n];

        // input 
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i]=in.nextInt();    
        }

        for(int i=0; i < n; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
   } 
}