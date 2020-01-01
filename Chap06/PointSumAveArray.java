import java.util.Scanner;

class PointSumAveArray {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        final int ninzu = 5;
        int[] tensu = new int[ninzu];
        
        System.out.println("input point of " + ninzu + " people.");
        for(int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "th people's point:");
            tensu[i] = stdIn.nextInt();
            sum += tensu[i];
        }
        
        System.out.println("sum:" + sum);
        System.out.println("average:" + (double)sum / ninzu);
    }
}   