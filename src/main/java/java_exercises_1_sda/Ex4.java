package java_exercises_1_sda;

public class Ex4 {
    public static void switchTable(int[] table){
        if (table.length >=3) {
            System.out.println("Before");
            TablePrinter.tablesPrinter(table);
            int tmp = table[0];
            table[0] = table[2];
            table[2] = tmp;
            System.out.println("After");
            TablePrinter.tablesPrinter(table);
        } else {
            System.out.println("Too small table");
        }
    }

    public static void tablesPrinter(int[] table){
        for (int el: table) {
            System.out.print("[" + el + "] ");
        }
        System.out.print("\n");
    }
}
