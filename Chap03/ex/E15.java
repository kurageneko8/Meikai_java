import java.util.Scanner;

class E15{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a = in.nextInt();
        System.out.print("b:");
        int b = in.nextInt();
        
        if(b > a){
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println("arranged to be a>=b");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}