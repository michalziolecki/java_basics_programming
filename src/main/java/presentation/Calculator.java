package presentation;

public class Calculator {

    public static final int ZERO = 0;

    // ------------- obiektowe elementy -------------
    private String typeName; // = null

    public Calculator() {
        // domyslny
    }

    public Calculator(String typeName) { // String typeName = "Cisco"
        this.typeName = typeName;
    }

    public void setTypeName(String typeName) { // String typeName = "Asus"
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public int addToNumberEnentity(int a, int b) {
        System.out.println(this.typeName);
        return a + b;
    }

    // ------------- -------------
    public static int addToNumbers(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
