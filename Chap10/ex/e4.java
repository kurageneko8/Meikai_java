import java.util.Scanner;

class ExId {
    static int counter = 0;
    public static int n = 1;

    public int Exid;

    public ExId( ) {
        Exid += n;
    }

    public int getExId() {
        return Exid;
    }

    public static int getMaxExId() {
        return counter;
    }

    public static void setN(int argN) {
        n = argN;
    }
}

public class e4 {
    public static void main(final String[] args) {
        final ExId a = new ExId();
        final ExId b = new ExId();

        System.out.println("a's Exid: " + a.getExId());
        System.out.println("b's Exid: " + b.getExId());
        
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        ExId.setN(n);
        System.out.println("n: " + n);


        System.out.println("ExId.counter = " + ExId.counter);
        System.out.println("a.counter = " + a.counter);
        System.out.println("b.counter = " + b.counter);
        System.out.println("maxExId = " + ExId.getMaxExId());
    }
}