import java.util.Random;
import java.util.Scanner;

class e8 {

    static int random(int a, int b) {
        Random rand = new Random();
        if(b < a) return a;
        return rand.nextInt(b-a)+a;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("a:");
        a = in.nextInt();
        System.out.print("b:");
        b = in.nextInt();
        
        int ret = random( a,  b);       
        System.out.println("ret:"+ ret);

    }
}