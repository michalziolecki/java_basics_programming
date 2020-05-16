package java_exercises_1_sda;

public class Ex6 {

    public static int[] minusCounter(int[] in){
        int counter = 0;
        for(int number: in ){
            if (number < 0) counter++;
        }

        int[] out = new int[counter];
        for (int i =0; i < out.length; i++ ){
            int number = in[i];
            if (number < 0){
                out[i] = number;
            }
        }
        System.out.println("Out table");
        TablePrinter.tablesPrinter(out);
        System.out.println("Counter result: " + counter);
        return out;
    }
}
