package java_exercises_1_sda;

public class Ex9 {

    public static int myModulo(int number, int mod){
        System.out.println("number: " + number + " mod: " + mod + ":");
        int total = (int) number/mod;
        System.out.println("test total: " + total);
        float realNum = (float) number/mod;
        System.out.println("test real: " + realNum);
        System.out.print("\n");
        return number - (total * mod);
    }
}
