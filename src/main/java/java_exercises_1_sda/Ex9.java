package java_exercises_1_sda;

public class Ex9 {

    public static int myModulo(int number, int mod){
        int total = number/mod;
        return number - (total * mod);
    }
}
