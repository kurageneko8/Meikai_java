import java.util.Scanner;

class E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("int a:");
        int a = in.nextInt();
        System.out.print("int b:");
        int b = in.nextInt();
        
        if (a % b == 0) {
            System.out.print("b is devisor of a");
        } else if (a % b != 0) {
            System.out.print("b is not devisor of a");
        }
    }
}