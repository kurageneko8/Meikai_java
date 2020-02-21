/**
 * PetTester1
 */
public class PetTester1 {

    public static void main(String[] args) {
        Pet Jeff = new Pet("Jeff", "Ryo");
        Jeff.introduce();
        System.out.println();

        RobotPet r2d2 = new RobotPet("R2D2", "luke skywalker");
        r2d2.introduce();
        System.out.println();

        Pet p = r2d2;
        p.introduce();
    }
}