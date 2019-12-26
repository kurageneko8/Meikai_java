import java.util.Scanner;

class Season{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;

        do {
            System.out.print("judge season.\nmonth:");
            int month = stdIn.nextInt();

            if(month >= 3 && month <= 5)
                System.out.println("spring");
            else if(month >= 6 && month <= 8)
                System.out.println("summer");
            else if(month >= 9 && month <= 11)
                System.out.println("autumn");
            else if(month >= 12 && month <= 2)
                System.out.println("winter");
        
            System.out.print("again? 1:Yes/0:No :");
            retry = stdIn.nextInt();
        } while (retry == 1);

    }
}