import java.util.Scanner;

class ex5 {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("number of element:");
        int elementCnt = stdIn.nextInt();
        

        int[] a = new int[elementCnt];
        
        System.out.println("input point of " + elementCnt + " people.");
        for(int i = 0; i < elementCnt; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        // show val of array
        System.out.print("a = {");
        for(int i = 0; i < elementCnt; i++) {
            //  add comma if not initial time
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.print("}");
        
    }
}   