/**
 * A
 */
public class A {
    private int a;
    A() { a = 50; }
    int getA() { return a; }
}

/**
 * B
 */
public class B extends A {
    
}

/**
 * DefaultConstructer
 */
public class DefaultConstructer {

    public static void main(String[] args) {
        B x = new B();
        System.out.println("x.getA() = " + x.getA());
    }
    
}