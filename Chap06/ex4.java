import java.util.Random;
import java.util.Scanner;

// package MeikaiJava.Chap06;

/**
 * ex4
 */
public class ex4 {

   public static void main(String[] args) {
       Random rand = new Random();
       Scanner stdIn = new Scanner(System.in);

       System.out.print("cnt of elements:");
       int n= stdIn.nextInt();
       int[]a = new int[n];
       
       for(int i=0; i<n; i++){
           a[i] = 1+ rand.nextInt(12);// 1 to 12
        // for()
       }
       
    //    for(int i = n; n>0; n--){
        for(int j = 10; j>0; j--){// vertical line

            for(int i=0; i<n; i++){// horizontal line

            //    System.out.print("a["+ i + "] : ");

            //    for(int j = a[i]; j>0; a[i]--){
                //    System.out.print('*');
                //    }


            //   if (condition) {
                  
            //   }
                if (a[i] >= j) {// グラフの上から参照して、参照行より大きな数値を持つなら
                    
                    System.out.print('*');
                } else {
                    System.out.print(" ");

                }
               
               
                
                //    System.out.println("-");
                //    System.out.print(i%10);
            }
            System.out.println("");
            
        }
        
        // for(int k=0; k<=2; k++){
            for(int l=0; l<=n; l++) {
                System.out.print('-');
            }
            System.out.println();

            for(int l=0; l<=n; l++) {
                System.out.print(l%10);
            }
        // }

   } 
}