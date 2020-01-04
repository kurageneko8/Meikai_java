import java.util.Scanner;

class e4 {
    static int sum2n(int n) {
        int sum = 0;
        for (int i=1; i <= n; ++i){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("input number till that num continue addition:");
        int n = stdIn.nextInt(); 
        // 1 .. n sum
        int sum = sum2n(n); 
        System.out.printf("sum till n: %d", sum);
    }
}