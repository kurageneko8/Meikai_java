import java.util.Scanner;

/**
 * CarTester2
 */
public class CarTester2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input car data");

        System.out.println("name:");
        String name = in.next();
        System.out.println("width:");
        int width = in.nextInt();
        System.out.println("height:");
        int height = in.nextInt();
        System.out.println("length:");
        int length = in.nextInt();
        System.out.println("fuel:");
        double fuel = in.nextDouble();

        System.out.println("brand:");
        String brand = in.next();

        Car myCar = new Car(name, width, height, length, fuel, brand);

        System.out.println("ignite my Method!!!!");
        myCar.putBrand();

        while (true) {
            System.out.println("your point(" + myCar.getX() + ", " + myCar.getY() + 
                ") rest fuel "+ myCar.getFuel()
            );
            System.out.println("move?[0:No, 1:Yes]: ");
            if (in.nextInt() == 0) {
                break;
            }
            System.out.print("move distance in X axis:");
            double dx = in.nextDouble();
            System.out.print("move distance in Y axis:");
            double dy = in.nextDouble();
            if(!myCar.move(dx, dy)) {
                System.out.println("fuel is not enough!");
            }
        }

    }
}