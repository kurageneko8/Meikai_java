import java.util.Random;
import java.util.Scanner;

class ex9 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("number of Elements:");
        int num_elements = stdIn.nextInt();
        int [] elements = new int[num_elements];

        for(int i = 0; i < num_elements; i++) {
            elements[i] = 1 + rand.nextInt(10); 
            System.out.println("elements["+ i +"] = "+ elements[i]);
        }
        
        System.out.println("start swapping");
        
        for(int i = 1; i < num_elements; i++) {
            while(elements[i] == elements[i-1]) {
                elements[i] = 1 + rand.nextInt(10); 
            }
        }

        for(int i = 0; i < num_elements; i++) {
            System.out.println("elements["+ i +"] = "+ elements[i]);
        }

    }
}