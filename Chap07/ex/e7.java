import java.util.Scanner;
class e7{
    static void putStars(int n){
        putChars('*', n);
    }

    static void putChars(char c, int n){
        while(n-- > 0){
            System.out.print(c);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num of line for triangle:");
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++){
            putStars(i);
            System.out.println();
        }
    }
}