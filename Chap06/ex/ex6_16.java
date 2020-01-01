import java.util.Scanner;

/**
 * Matrix
 */
public class ex6_16 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in); 
        int [][]   fourline3col= new int[3][4];
        int [][]  threeline4col= new int[4][3];

        System.out.println("Difine array's value: 4line x 3columns");
        for(int i = 0; i<3; i++){// 
            for(int j = 0; j<4; j++) {//line
                fourline3col[i][j] = stdIn.nextInt();
            }
            System.out.println("next line");
        }
        
        System.out.println("Difine array's value: 3line x 4columns");
        for(int i = 0; i<4; i++){// 
            for(int j = 0; j<3; j++) {//line
                threeline4col[i][j] = stdIn.nextInt();
            }
            System.out.println("next line");
        }
        
        System.out.println("output: 4line x 3columns");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++)
                System.out.printf("%3d", fourline3col[i][j]);
            System.out.println();
        }

        System.out.println("output: 3line x 4columns");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++)
                System.out.printf("%3d", threeline4col[i][j]);
            System.out.println();
        }
      
        System.out.println("multi output:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++)
                System.out.printf("%3d", threeline4col[i][j]);
            System.out.println();
        }
      

    }

    
}