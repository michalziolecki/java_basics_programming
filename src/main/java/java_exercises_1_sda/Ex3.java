package java_exercises_1_sda;

public class Ex3 {
    public int multiplyTwoNumber(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
