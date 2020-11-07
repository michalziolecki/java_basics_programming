package presentation;

import java.util.Scanner;

public class ExampleClass {

    // moja metoda -> void nie zwraca nic,
    // String name to argument do uzycia w metodzie
   static void printName(String name, String surname) { // String name = "Michał"; String surname = "Ziółecki";
        System.out.println("ruszyła moja metoda");
        System.out.println("podane imie: " + name);
        System.out.println("podane nazwisko: " + surname);
    }

    static int diff(int arg1, int arg2) { // int arg1 = 4; int arg2 = 2;
        return arg1 - arg2; // zwracany wynik odejmowania przez metode | return -> = 2
    }

    static int[] returnMore(int arg1, int arg2) { // int arg1 = 4; int arg2 = 2;
        // zwracanie wielu argumentów na raz
        return new int[]{arg1, arg2}; // zwracany wynik dla kilku elementów
    }

    static boolean diff(int arg, boolean test){
       return true;
    }

    static Scanner createScannerWithSystemIn() {
       return new Scanner(System.in);
    }

    // metoda uruchamiająca program
    public static void main(String[] args) {

       System.out.println("Start programu");
        // Example 1
        printName("Michał", "Ziółecki");  // String name = "Michał"; String surname = "Ziółecki";
        // example 2
        int result = diff(4, 2); // return -> int result = arg1 - arg2; // zwracany typ musi byc zgodny typem przypisanym
        System.out.println("result: " + result);
        result++;
        System.out.println("result po inkrementacji: " + result);
        // example 3
//         Scanner myScanner = new Scanner(System.in);
        System.out.println("Wpisz coś: ");
        Scanner myScanner = createScannerWithSystemIn();
        String line = myScanner.nextLine();
        System.out.println("Scanner z metody - moj input: '" + line + "'");
        // example 4
//        int retuned = diff(5,2);
//        System.out.println(diff(5,2));
   }
}

