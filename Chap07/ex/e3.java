import java.util.Scanner;

class e3 {

    static int med(int a, int b, int c) {
        int med = a;

        if(b < a) {
            if(c < b) med = b;
            if(c > a) med = a;
        } else if(b > a) {
            if(a > c) med = a;
            if(a < c) med = c;
        } else if(b == a) {
            // impossible
        }
        return med;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int a;
        int b;
        int c;

        do {
            System.out.print("Int a: "); a = stdIn.nextInt();
            System.out.print("Int b: "); b = stdIn.nextInt();
            System.out.print("Int c: "); c = stdIn.nextInt();
        } while(a == b || b == c || c == a);


        System.out.println("med is " + med(a, b, c) + " ");
        // System.out.println("minimam is " + med(a, b, c) + " ");
    }
}