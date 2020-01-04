import java.util.Scanner;

class Ex18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("define number of row:");
        int row = stdIn.nextInt();
        int col;
        // int col = stdIn.nextInt();
        int [][] c;
        c = new int[row][];

        // System.out.println("define number of columns");
        for(int i = 0; i < row; ++i ) {
            System.out.print("number of columns for " + (i+1) + "th row: ");
            col = stdIn.nextInt();
            c[i] = new int[col]; 
        }
        System.out.println("");

        for(int i=0; i< c.length; ++i){
            for(int j = 0; j < c[i].length; ++j){
                System.out.printf("%2d", c[i][j]);
            }
            System.out.println("");
        }
    }
}