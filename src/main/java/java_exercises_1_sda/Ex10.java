package java_exercises_1_sda;

public class Ex10 {

    public static boolean testMyModulo(int[] testNumb, int mod){
        for(int number: testNumb){
            int originRest = number % mod;
            int myRest = Ex9.myModulo(number, mod);
            if (originRest != myRest) return false;
        }
        return true;
    }
}
