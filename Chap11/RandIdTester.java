import id.RandId;
/**
 * RandIdTester
 */
public class RandIdTester {

    public static void main(String[] args) {
        RandId a = new RandId();
        RandId b = new RandId();
        RandId c = new RandId();
        System.out.println("a idNum:" + a.getId());
        System.out.println("b idNum:" + b.getId());
        System.out.println("c idNum:" + c.getId());
    }
}