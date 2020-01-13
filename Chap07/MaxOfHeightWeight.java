import java.util.Scanner;

/**
 * MaxOfHeightWeight
 */
 class MaxOfHeightWeight {

    static int maxOf(int[] a){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number of people:");
        int n = in.nextInt();
        
        int[] height = new int[n];
        int[] weight = new int[n];
        
        System.out.printf("input height and weight for %d people.\n", n);
        
        // int h;
        // int w;
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%d th people's hieght:", i+1);
            height[i] = in.nextInt();
            
            System.out.printf("%d th people's weight:", i+1);
            System.out.printf("%d th people's weight:", i+1);
            weight[i] = in.nextInt();
        }
        
        System.out.println("highest :" + maxOf(height) + "cm");
        System.out.println("heviest :" + maxOf(weight) + "kg");
        
        
    }
    
}