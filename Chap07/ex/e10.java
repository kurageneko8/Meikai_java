import java.util.Random;

// package MeikaiJava.Chap07.ex;

/**
 * e10
 */
import java.util.Scanner;
import java.util.Random;

class e10 {

    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry(){
        int cont;// continue
        do {
            System.out.print("again?<Yes...1/No...0>:");
            cont = stdIn.nextInt();
        } while (cont != 1 && cont != 0);
        return cont == 1;// if 1 then true
    }
    public static void main(final String[] args) {
        final Random rand = new Random();
        System.out.println("arithmetic training");

        do {
            final int x = rand.nextInt(900) + 100;
            final int y = rand.nextInt(900) + 100;
            final int z = rand.nextInt(900) + 100;
            int type = rand.nextInt(4);
            int k;

            loop: while (true) {
                switch (type) {
                    case 0:
                        System.out.print(x + " + " + y + " + " + z + " = " );
                        k = stdIn.nextInt();
                        if(k == x + y + z) break loop;// collect
                        System.out.println("Wrong");
                        break;
                
                    case 1:
                        System.out.print(x + " + " + y + " - " + z + " = " );
                        k = stdIn.nextInt();
                        if(k == x + y - z) break loop;// collect
                        System.out.println("Wrong");
                        break;
                
                    case 2:
                        System.out.print(x + " - " + y + " + " + z + " = " );
                        k = stdIn.nextInt();
                        if(k == x - y + z) break loop;// collect
                        System.out.println("Wrong");
                        break;
                
                    case 3:
                        System.out.print(x + " - " + y + " - " + z + " = " );
                        k = stdIn.nextInt();
                        if(k == x - y - z) break loop;// collect
                        System.out.println("Wrong");
                        break;
                
                    default:
                    // impossible
                        break;
                }
                
            }
        } while (confirmRetry());
    }
    
}