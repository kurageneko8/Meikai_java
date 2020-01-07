import java.util.Scanner;

class E16{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a = in.nextInt();
        System.out.print("b:");
        int b = in.nextInt();
        System.out.print("c:");
        int c = in.nextInt();
        int tmp = b;
       
        if(a == b && b == c && c == a){

        } else {

            if(a > b) {
                if (b > c) {
                    // a > b > c
                } else if(b < c) {
                    // a > c > b
                    tmp = c;
                    c = b;
                    b = tmp;
                } else if (b == c) {
                    // a > b && b == c
                }
            } else if (a < b){
                if (b < c) {
                    // c > b > a 
                    // c > b > a 
                    tmp = a;
                    a = c;
                    c = tmp;
                } else if (b > c) {
                    // b > a 
                    // b > c

                    if(a > c) {
                        // b > a > c
                        tmp = b;
                        b = a;
                        a = tmp;  
                    } else if (a < c) {
                        // b > c > a
                        tmp = a;
                        a = b;
                        b = c;
                        c = tmp;
                    } else if (a == c) {
                        // b > a && a == c
                        tmp = a;
                        a = b;
                        b = tmp;
                    }
                    
                } else if(b == c) {
                    // a < b && b == c
                    tmp = a;
                    a = b;
                    b = tmp;
                }
            } else if ( a == b) {
                if(a < c) {
                    // c > a,b
                    // a == b 
                    tmp = a;
                    a = c;
                    c = tmp;
                
                } else if(a > c) {
                    // a == b 
                    // a,b > c
                }

            }
        }


        
        // if(b > a){
        //     int tmp = a;
        //     a = b;
        //     b = tmp;
        // }
        System.out.println("arranged to be a >= b >= c");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }
}