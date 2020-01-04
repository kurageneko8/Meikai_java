import java.util.Scanner;

class e1 {

    static int signOf(int n) {
        int ret = 999;
        if(n < 0 ){
            ret = -1;
        } else if(n ==0) {
            ret = 0;
        } else if(n > 0) {
            ret = 1;
        }
        return ret;
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("input number:");
        int n = stdIn.nextInt();        

        // call method
        int ret = signOf(n);
        System.out.print("return:" + ret);
    }
}