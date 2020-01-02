import java.util.Random;
import java.util.Scanner;

class ex11 {
    
    static int num_elements;
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int num_elements;
        do {
            System.out.print("number of Elements (equal or less than 10): ");
            num_elements = stdIn.nextInt();
            // int n = num_elements;
        // } while (n > 10);
        } while (num_elements > 10);

        System.out.println("num_elements_a: " + num_elements);

        int [] elements = new int[num_elements];

        System.out.println("num_elements_b: " + num_elements);
        int [] used_row = new int[num_elements];// used elements
        
        for(int i = 0; i < num_elements; i++) {

            elements[i] = 1 + rand.nextInt(10); 
            // used_row[i] = elements[i]; 
            
            // if (i != 0) {// first time does not need to check
            //     for(int used_e : used_row) {
            //         // if same with used_element again
            //         while (used_e == elements[i]) {
            //             elements[i] = 1 + rand.nextInt(10); 
            //         }
            //     }
            // }
            
            System.out.println("elements["+ i +"] = "+ elements[i]);

        }
        
        // System.out.println("start swapping");
        

        for(int i = 0; i < num_elements; i++) {
            // same value that has grater index
            // for(int ex=0; ex < num_elements; ex++){
                for(int j = 0; j < num_elements; j++) {
                    
                    if (i == j) continue;
                    if (elements[i] == elements[j]) {
                        System.out.print("elements["+i+"]:");
                        elements[i] = stdIn.nextInt();

                    }
            //         while(
            //             elements[i] == elements[0] 
            //             ) 
            //         {
            //             elements[i] = 1 + rand.nextInt(10); 
            //         }
            //     }
            } 
        }
        
        // System.out.println("num_elements: " + num_elements);
        for(int i = 0; i < num_elements; i++) {
            System.out.println("elements["+ i +"] = "+ elements[i]);
        }

        System.out.println("end");
    }
}