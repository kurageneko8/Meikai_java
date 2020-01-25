/**
 * TimeAccountTester1
 */
public class TimeAccountTester1 {

    public static void main(String[] args) {
        Account adachi = new Account("adachi", "123456", 1000);
        TimeAccount nakata = new Account("nakata", "654321", 200, 500);

        Account x;
        x = adachi;
        x = nakata;

        System.out.println("x's balance:"+ x.getBalance());

        TimeAccount y;
        // y = adachi;// nonna be error
        y = nakata;

        System.out.println("y's balance:"+ y.getBalance());
        System.out.println("y's regular balance:"+ y.getTimeBalance());

    }
}