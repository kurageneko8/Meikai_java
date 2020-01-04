/**
 * input number bellow 
 *  class
 *  people of each class
 *  point of all people
 *
 *  by class , all
 *  AVG
 *  SUM
 **/ 
import java.util.Scanner;
class Ex19 {
    public static void main(String[] args) {

        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("define number of class:");
        int class_num = stdIn.nextInt();
        int studnet_num;
        int point;
        // int studnet_num = stdIn.nextInt();
        int [][] c;
        c = new int[class_num][];

        // System.out.println("define number of students");
        for(int i = 0; i < class_num; ++i ) {
            System.out.println("******************");
            System.out.print("number of students for " + (i+1) + "th class_num: ");
            studnet_num = stdIn.nextInt();
            c[i] = new int[studnet_num]; 
            
            for(int j =0; j < studnet_num; ++j) {
                System.out.print("number of "+ j +" th student in " + (i+1) + "th class: ");
                point = stdIn.nextInt();
                c[i][j] = point; 
                
            }
            
        }
        System.out.println("");
        
        
        System.out.println("class |  sum     avg  ");
        System.out.println("------+----------------");

        int all_sum = 0;
        float all_avg = 0;
        float class_avg;
        for(int i=0; i< c.length; ++i){
            int class_sum = 0;
            for(int j = 0; j < c[i].length; ++j){
                // System.out.printf("%2d", c[i][j]);
                class_sum += c[i][j];
            }
            class_avg = class_sum / c[i].length;

            all_sum += class_sum;
            all_avg += class_avg; 
            System.out.printf("%2d    |  %3d     %3f", i, class_sum, class_avg);
            System.out.println("");
        }
        all_avg = all_avg / class_num;
        System.out.println("------+----------------");
        System.out.printf("tal   |  %3d     %3f  ", all_sum, all_avg);
    }
}