package presentation;

public class ReturnExample {
    public static void printNumbersVarArgs(int... numbers) {
        System.out.println("printNumbersVarArgs");
        System.out.println("numbers.len=" + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "]==" + numbers[i]);
        }
        System.out.println("\n");
    }

    // printNumbersVarArgs praktycznie to samo co printNumbersTable
    public static void printNumbersTable(int[] numbers) {
        System.out.println("printNumbersTable");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "]==" + numbers[i]);
        }
        System.out.println("\n");
    }

    public static void printNumbersArgsVarArgs(int value, int value2, int... numbers) {
        System.out.println("printNumbersArgsVarArgs");
        System.out.println("value: " + value);
        System.out.println("numbers.len=" + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "]==" + numbers[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        printNumbersVarArgs();
//        printNumbersTable(new int[]{1, 2, 3, 4});
        printNumbersArgsVarArgs(5, 3, 123425, 3214,123,23);
    }
}
