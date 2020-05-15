package java_ex_1_mz.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad5 {

    ArrayList<String> listOfName = new ArrayList <>(  );
    Scanner inPut = new Scanner( System.in );


    public Zad5()
    {
        writeName();
        printTable();
    }

    public void writeName()
    {
        String temporaryName;
        System.out.println("\n5a.Podaj 5 imion:");
        for(int i = 0; i < 5; i++)
        {
            //wczytywanie tekstu do enteru
            temporaryName = inPut.nextLine();
            listOfName.add( temporaryName );
        }
        System.out.println("Dzieki za podanie imion :)");
    }

    public void printTable()
    {
        System.out.println("5b.Drukuje podane imiona");
        int iterator = 0;
        while (iterator < listOfName.size()-1)
        {
            System.out.print(listOfName.get( iterator ) + " | ");
            iterator++;
        }
    }


}
