import java.util.Scanner;

class ex4_1{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;

        do {
            System.out.print("Input Int:");
            int n = stdIn.nextInt();

            if(n > 0)
                System.out.println("positive");
            else if(n < 0)
                System.out.println("negative");
            else
                System.out.println("Zero");
          
        
            System.out.print("again? 1:Yes/0:No :");
            retry = stdIn.nextInt();
        } while (retry == 1);

    }
}