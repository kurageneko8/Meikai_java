import java.util.Scanner;

/**
 * Matrix
 */
public class ex6_16 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in); 
        int [][]   l3c4 = new int[3][4];
        int [][]  l4c3= new int[4][3];

        System.out.println("Difine array's value: 4line x 3columns");
        for(int i = 0; i<3; i++){// 
            for(int j = 0; j<4; j++) {//line
                System.out.print("l3c4 ["+i+"]["+j+"]:");
                l3c4 [i][j] = stdIn.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("Difine array's value: 3line x 4columns");
        for(int i = 0; i<4; i++){// 
            for(int j = 0; j<3; j++) {//line
                System.out.print("l4c3["+i+"]["+j+"]:");
                l4c3[i][j] = stdIn.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("output: Line3 x Column4");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++)
                System.out.printf("%3d", l3c4 [i][j]);
            System.out.println();
        }

        System.out.println("output: Line4 x Column3");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++)
                System.out.printf("%3d", l4c3[i][j]);
            System.out.println();
        }
      
        System.out.println("multi output:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++) {
                if(
                    // if line key does not exist
                    l3c4.length == i || 
                    l4c3.length == i || 
                    //if column key does not exist
                    l3c4[i].length == j || 
                    l4c3[i].length == j
                ) 
                {
                    System.out.print("0 ");
                    continue;
                }
                    int mulch = l3c4[i][j] * l4c3[i][j];
                    System.out.print(mulch + " ");
        }
                    System.out.println();
        }
      

    }

    
}