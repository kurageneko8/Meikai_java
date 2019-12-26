import java.util.Random;
// import java.util.Scanner;

class ex2_7 {
    public static void main (String[] args) {

        Random rand = new Random();
        // int lucky = rand.nextInt(10);
        // System.out.println("luckyNum:" + lucky);

        // int Mlucky = rand.nextInt(10);
        // System.out.println("MinusluckyNum:" + Mlucky*(-1));
        // return r.nextInt((max - min) + 1) + min;

        
        int niKetalucky = rand.nextInt(90);// 0 <= n <= 89
        niKetalucky = niKetalucky + 10;// 10 <= n <= 99
        System.out.println(niKetalucky);
    }
}