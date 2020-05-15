package java_ex_2_mz.ex1_8;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class MainRegularne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        RegexValidator regexValidator = new RegexValidator();
        String inPutString;
        int number;
        boolean test;


        /*//Zad8
        System.out.println("Write number of Facture: ");
        inPutString = scanner.nextLine();
        test = regexValidator.checkFacture(inPutString);
        System.out.println("Test: " + test);*/

        /*//zad 7
        System.out.println("Write serial number of program: ");
        inPutString = scanner.nextLine();
        test = regexValidator.checkSerialNumberOfProgram(inPutString);
        System.out.println("Test: " + test);*/

       /* //Zad 6.
        System.out.print("Write your serial number: ");
        inPutString = scanner.nextLine();
        test = regexValidator.checkSerialNumber( inPutString );
        System.out.println("Your date is: " + test);*/

       /* //Zad 5.
        System.out.print("Write your date: ");
        inPutString = scanner.nextLine();
        test = regexValidator.checkDate( inPutString );
        System.out.println("Your date is: " + test);*/


      /*  //Zad3
        System.out.print("Write your login: ");
        inPutString = scanner.nextLine();
        test = regexValidator.checkLogin( inPutString );
        System.out.println("Login status: " + test);*/

        //zad1
//        System.out.print("Write sequenses of numbers: ");
//        inPutString = scanner.nextLine();
        /*test = regexValidator.checkInPut( inPutString );
        if(test == false )
        {
            System.out.println("incorrect input");
        }
        else
        {
            System.out.println("correct input");
            number = Integer.parseInt( inPutString );
            if(number % 2 == 0) System.out.println("divisible by two");
            else System.out.println("no divisible by two");
        }*/

        //zad2
//        System.out.print("Write addres: ");
//        inPutString = scanner.nextLine();
        /*test = regexValidator.checkAddresCode( inPutString );
        //System.out.println("test testu: " + test);
        System.out.print(String.format( "Adress is: %s ", test ? "correct" : "uncorrect" ));*/



    }
}
