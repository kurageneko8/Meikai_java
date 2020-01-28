class Id {
    static int counter = 0;

    private int id;

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a's id: " + a.getId());
        System.out.println("b's id: " + b.getId());

        System.out.println("Id.counter = " + Id.counter);
        System.out.println("a.counter = " + a.counter);
        System.out.println("b.counter = " + b.counter);
    }
}