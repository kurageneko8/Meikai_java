import java.util.Scanner;

class Max3Method {

    static int max(int a, int b, int c) {
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int a: "); int a = stdIn.nextInt();
        System.out.print("Int b: "); int b = stdIn.nextInt();
        System.out.print("Int c: "); int c = stdIn.nextInt();

        System.out.println("Max is " + max(a, b, c) + ". ");
    }
}