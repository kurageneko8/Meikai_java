/**
 * PetTester2
 */
public class PetTester2 {

    static void intro(Pet p) {
        p.introduce();
    }

    public static void main(String[] args) {
        Pet[] a = {
            new Pet("Kurt", "ai"),
            new RobotPet("R2D2", "luke"),
            new Pet("Maikel", "hideo"),
        };

        for(Pet p : a) {
            intro(p);
            System.out.println();
        }
    }
}