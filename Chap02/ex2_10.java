import java.util.Scanner;

class ex2_10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("familyName:");
        String family = in.next();

        System.out.print("firstName:");
        String firstName = in.next();
        
        System.out.print("hello " + family + firstName);
        
    }
}