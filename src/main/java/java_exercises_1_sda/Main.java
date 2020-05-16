package java_exercises_1_sda;

public class Main {

    public static void main(String[] args){

        Ex1.printMultiplying(5);

        boolean result = Ex2.isPrimeNumber(7); // true
        System.out.println("isPrime: " + result);
        boolean resultTwo = Ex2.isPrimeNumber(8); // false
        System.out.println("isPrime: " + resultTwo);

        Ex3 objectEx1 = new Ex3();
        int ret = objectEx1.mulitplyTwoNumber(4, 5);
        System.out.println("Multiplying: " + ret);
        
    }
}
