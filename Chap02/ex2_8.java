import java.util.Random;
import java.util.Scanner;

class ex2_8 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int inputNum = stdIn.nextInt();// 入力を受け付け
        
        int min = inputNum - 5;
        int max = inputNum + 5;
        int r = rand.nextInt((max-min)+1);// r:5 - (-5) 
        int r_ = r +min;// min <= r_ <= min + 10
        System.out.println(r_);
    }
}