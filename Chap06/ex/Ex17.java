// package MeikaiJava.Chap06.ex;
import java.util.Scanner;
/**
 * Ex17
 */
public class Ex17 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[][] point = new int[6][2];
        int[] subject_sum = new int[2];
        int[] student_sum = new int[6];
        
        System.out.println("input point of each studnet");
        System.out.println("Japanese, Mathmatics");
        
        for(int i = 0; i < 6; ++i) {
            System.out.println(" input point of "+ i +" th studnet: ");
            for(int j = 0; j < 2; ++j) {
                point[i][j] = stdIn.nextInt();
                subject_sum[j] += point[i][j];
                student_sum[i] += point[i][j];
            }
        }

        for(int i = 0; i < 6; ++i) {
            System.out.print("\n point of "+ i +" th studnet: ");
            for(int j = 0; j < 2; ++j) {
                System.out.print(point[i][j] + " ");
            }
        }
        
        System.out.println("average by subject");
        for(int i =0; i < subject_sum.length; ++i){
            // System.out.print(" point of "+ i +" th : ");
            int avg = subject_sum[i] / student_sum.length;
            System.out.println("avg of subject: " + i + "th: "  + avg);
        }

        System.out.println("average by student");
        for(int i =0; i < student_sum.length; ++i){
            // System.out.print(" point of "+ i +" th : ");
            int avg = student_sum[i] / subject_sum.length;
            System.out.println("avg of student " + i + "th: " + avg);
            // System.out.println("avg: " + avg);
        }


    }
}