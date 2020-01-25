/**
 * AbstLine
 */
public abstract class AbstLine extends Shape {
    private int length;
    public AbstLine(int length) {
        setLength(length);
    }
    public int getLength() {
        return length;
    }

    public void setLength(int Length) {
        this.length = length;
    }

    public String toString() {
        return "AbstLine(length:"+ length + ")";
    }
}