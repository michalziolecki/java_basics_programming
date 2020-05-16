package java_exercises_1_sda;

public class Ex5 {
    public static void topAndMin(int[] table){
        int min = 0;
        int max = 0;
        for (int number: table){
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
