/**
 * Person_e1
 */
public class PersonE1 {

    private String name;
    private int height;
    private int weight;

    PersonE1(
        String name,
        int height,
        int weight
    ) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    String getName() { return name; }
    double getHeight() { return height; }
    double getWeight() { return weight; }

    void putSpec() {
        System.out.println("height:" + height);
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}