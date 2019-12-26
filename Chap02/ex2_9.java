import java.util.Random;

class ex2_9 {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.print("a random number:");
        // double r = rand.nextDouble();
        // double i = rand.nextInt(9);
        // double r = rand.nextDouble();
        
        // int i = rand.nextInt();
        int max = 1;
        int min = -1;
        int r = rand.nextInt(2);// 0 or 1
        double d = rand.nextDouble();
        double rd = r+d; 
        double x = rd-1;
        
        // System.out.println(r);//dubug
        System.out.println(x);
        // int min = n - 5;
        // int max = n + 5;
        // int r = rand.nextInt((max-min)+1);// r:5 - (-5) 
        // int r_ = r +min;// min <= r_ <= min + 10
    }
}