package java_exercises_1_sda;

public class Ex8 {

    //https://www.matemaks.pl/ciag-arytmetyczny.html
    public static boolean isArithmeticSeries(int[] tab){
        if (tab.length < 2) return false;
        //wzor: an = a1 + (n-1)*r
        // r = (an - a1)/(n-1)
        boolean isSeries = true;
        int correctDiff = (tab[tab.length - 1] - tab[0]) / (tab.length - 1);
        for (int i = 1; i < tab.length; i++) {
            int r = tab[i] - tab[i-1];
            if (r != correctDiff) isSeries = false;
            break;
        }
        return isSeries;
    }
}
