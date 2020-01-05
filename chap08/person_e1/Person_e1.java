/**
 * Person_e1
 */
public class Person_e1 {

    private String name;
    private int height;
    private int weight;

    Person_e1(
        String name,
        int height,
        int weight
    ) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double getHeight() { return height; }
    double getWeight() { return weight; }

    void putSpec() {
        System.out.println("height:" + height);
    }
}