import java.util.Scanner;
class E1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("int:");
        int n = in.nextInt();
        
        System.out.print("absolute value:");
        if (n < 0){
            n = n * (-1);
        }
        System.out.print(n);
        
    }
}