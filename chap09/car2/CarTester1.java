// import java.util.Date;

/**
 * CarTester1
 */
 class CarTester1 {
    public static void main(String[] args) {
        Day d = new Day(2010, 10, 15);
        // tring name
        //  int width
        //  int height
        //  int length
        //  double fuel
        // Day purchaseDay
        Car myCar = new Car("myCar", 1885, 1490, 5220, 90.0, d);

        // 1
        Day p = myCar.getPurchaseDay();
        System.out.println("perchaseDay:" + p);

        // 2
        p.set(1999, 12, 31);

        // 3
        Day q = myCar.getPurchaseDay();
        System.out.println("perchaseDay:" + q);

    }
    
}