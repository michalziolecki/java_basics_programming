package presentation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setTypeName("Asus");
        System.out.println(calculator.addToNumberEnentity(1,2 ));
//        calculator.getTypeName();
//        calculator.typeName;
        Calculator calculator2 = new Calculator("Cisco");
        System.out.println(calculator2.addToNumberEnentity(4,3));

        int i = Calculator.ZERO;
        System.out.println(Calculator.addToNumbers(1,2));
        // Calculator calculator = new Calculator();
    }
}
