import java.util.Scanner;

// package MeikaiJava.Chap07;

/**
 * countBits
 */
 class countBits {

static void printBits(int x) {
    for (int i = 31; i  >= 0; i--) {
        System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
}

static int countBits(int x) {
    int bits = 0;
    while (x != 0) {
        if ((x & 1) == 1) {
            bits++;
        }
        x >>>= 1;
    }
    return bits;
}
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("int:");
     int x = in.nextInt();

     System.out.print("Bit structure = ");
     printBits(x);
     System.out.print("\ncount of bit with balue 1 = " + countBits(x));

 }

}