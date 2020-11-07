package presentation;

public class MethodPresentation {

    public static void printName(String name){ // String name = "Michał";
        System.out.println("Run printName method");
        System.out.println("Hello " + name + "!");
        System.out.println();
    }

    // int number1 = 4; int number2 = 2;
    public static int addToNumbers(int number1, int number2) {
        return number1 + number2; // zwrócenie wartości do miejsca wywołania
    }

    // sumNumbers(String info, int[] numbers)
    public static int sumNumbers(String info, int... numbers) {
        int sum = 0;
        System.out.println("moje info: " + info);
        for (int i = 0; i < numbers.length; i++){
            sum =+ numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Main method here ! \n");

//        sumNumbers("Dodaj nie gadaj", new int[]{1,2,3});
        int result = sumNumbers("Dodaj nie gadaj", 1,2,3); // int result = sum;

        System.out.println("End main method");
    }
}
