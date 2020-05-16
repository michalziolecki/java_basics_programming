package java_exercises_1_sda;

public class TablePrinter {
    public static void tablesPrinter(int[] table){
        for (int el: table) {
            System.out.print("[" + el + "] ");
        }
        System.out.print("\n");
    }
}
