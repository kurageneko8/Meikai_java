import java.util.Scanner;

// package MeikaiJava.Chap06.ex;

/**
 * ex13
 */
public class ex13 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("num of elements:");
        int n = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];



        for(int i=0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = stdIn.nextInt();
        }
        
        for(int i=0; i < n; i++){
            b[n-1-i] = a[i];
        }
        
        System.out.println("copy is done");
    
        for(int i=0; i< n; i++){
            System.out.println("b["+i+"] = " + b[i]);
        }
            


        
    }
}