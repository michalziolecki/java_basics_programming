package presentation;

import java.util.Scanner;

public class ScanTraining {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String name = "";
        while(true){
            System.out.println("Wprowadź imie: ");
            name = myScan.nextLine(); // czytanie do znaku \n
            if (name.length() > 0) break;
        }
        System.out.println("Wprowadź nazwisko: ");
        String surname = myScan.nextLine();
        System.out.println("Wprowadź pesel: ");
        String personId = myScan.nextLine();

        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Pesel: " + personId);
    }
}
