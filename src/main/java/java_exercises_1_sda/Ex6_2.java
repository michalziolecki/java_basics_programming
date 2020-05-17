package java_exercises_1_sda;

public class Ex6_2 {
    public static int[] countBelowZeroNumb(int[] tab) {
        // liczymy liczby ujemne
        // tab = {2, 5, -10, 5, -12, -3}
        int counter = 0;
        for (int numb : tab) {
            if (numb < 0) {
                counter++; // counter = counter + 1;
            }
        }
        // tworzymy tablice
        int[] out = new int[counter]; // X romiar ale jest pusta
        int out_it = 0;
        // wypelniamy nowa tablice zwrotna
        for (int numb : tab){
            if (numb < 0) {
                out[out_it] = numb;
                out_it++;
            }
        }
        return out;
    }
}
