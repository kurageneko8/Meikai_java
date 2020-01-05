/**
 * Car
 */
public class Car {

    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;
    private String brand;

    Car(
        String name,
        int width,
        int height,
        int length,
        double fuel,
        String brand
     ) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        this.brand = brand;
        x = y = 0.0;
     }

     double getX() { return x; }
     double getY() { return y; }
     double getFuel() { return fuel; }
     
     void putBrand() { System.out.println("brand:" + brand); }

     void putSpec() {
         System.out.println("name:" + name);
         System.out.println("width:" + width);
         System.out.println("height:" + height);
         System.out.println("length:" + length);
     }

    boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);

        if (dist > fuel) {
            return false;
        } else {
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }     
    public static void main(String[] args) {
        
    }
}