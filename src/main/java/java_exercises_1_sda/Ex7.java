package java_exercises_1_sda;

public class Ex7 {
    public static int[] arithmeticSeries(int length, int firstVal, int gap){
        int[] arithmeticSeriesTab = new int[length];
        arithmeticSeriesTab[0] = firstVal;
        for (int i=1; i <length; i++){
            arithmeticSeriesTab[i] = arithmeticSeriesTab[i - 1] + gap;
        }
        System.out.println("arithmetic series:");
        TablePrinter.tablesPrinter(arithmeticSeriesTab);
        return arithmeticSeriesTab;
    }
}
