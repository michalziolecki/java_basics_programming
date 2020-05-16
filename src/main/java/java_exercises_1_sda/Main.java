package java_exercises_1_sda;

public class Main {

    public static void main(String[] args){

        System.out.println("Ex1: ");
        Ex1.printMultiplying(5);

        System.out.println("Ex2: ");
        boolean result = Ex2.isPrimeNumber(7); // true
        System.out.println("isPrime: " + result);
        boolean resultTwo = Ex2.isPrimeNumber(8); // false
        System.out.println("isPrime: " + resultTwo);

        System.out.println("Ex3: ");
        Ex3 objectEx1 = new Ex3();
        int ret = objectEx1.multiplyTwoNumber(4, 5);
        System.out.println("Multiplying: " + ret);

        System.out.println("Ex4: ");
        int[] table = {1, 2, 3};
        Ex4.switchTable(table);

        System.out.println("Ex5.1: ");
        Ex5.topAndMin(table);
        System.out.println("Ex5.2: ");
        int[] minTop = {-2, -10, 22, 15, 105};
        Ex5.topAndMin(minTop);

    }
}
