import java.util.Scanner;

class e6 {

    static void printSeason(int month) {
        switch (month) {

            case 3:
            case 4:
            case 5:
                System.out.print("spring");
                break;
        
            case 6:
            case 7:
            case 8:
                System.out.print("summer");
                break;
        
            case 9:
            case 10:
            case 11:
                System.out.print("autumn");
                break;

            case 12:
            case 1:
            case 2:
                System.out.print("winter");
                break;
        
            default:
                break;
        }
    }
    
    public static void main(String[] args) {
        System.out.print("month:");
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        printSeason(n);
    }
}