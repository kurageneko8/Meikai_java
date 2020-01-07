import java.util.Scanner;
class E12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a = in.nextInt();
        System.out.print("b:");
        int b = in.nextInt();
        System.out.print("c:");
        int c = in.nextInt();
        int med = a;
        
        if(a < b) {
            if(b < c) {
                med = b;
            } else if(b > c) {
                if(a == c) {
                    // med = a
                } else if (a > c){// b > a > c
                    // med = a
                }
            } else if(b == c){
                med = b;
            }
        } else if (a > b) {
            if(b > c) {
                med = b;
            } else if (b < c) {
                if (a < c) {
                    // med = a
                } else if (a > c) {// a > c > b
                    med = c;
                } else if (a == c) {
                    // med = a
                }
            } else if (b == c ){
                med = b;
            }

        } else if(a == b) {
            // med = a
        }

        System.out.print("med:" + med);

        // if(a == b || c == a) {
        //     med = a;
        //     System.exit(0);
        // }
        // if(b == c) {
        //     med = b;
        //     System.exit(0);
        // }

        // if(a > b) {
        //     if(b > c){
        //         med = b;
        //     } else if(b < c){

        //     }
        // }


    }
}