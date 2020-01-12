// package MeikaiJava.Chap07.ex;

import java.util.Scanner;

/**
 * e9
 */
 class e9 {

    static Scanner in = new Scanner(System.in);
    
    static int readPlusInt() {
        int n;
        do {
            System.out.print("positive integer:");
            n = in.nextInt();
        } while (n <= 0);
        return n;
    }
    public static void main(String[] args) {
        int n;
        n = readPlusInt();
        System.out.println("n:"+n);
    }

}