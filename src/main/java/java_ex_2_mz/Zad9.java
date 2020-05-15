package java_ex_2_mz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Zad9 {

    String word;
    String inPut;
    Integer numberOfChar = 0, avarage = 0;
    Integer wordWithMaxNumberOfChar = 0, wordWithMinNumberOfChar = 0, temporary = 0;
    List<String> listOWords =  new ArrayList<String>(  );

    public void getInput(String inPutString)
    {
        inPut = inPutString;
    }

    public void createStatistic()
    {
        //crtl +q skrot do dzialania metody
        //inPut.split( " "); // w jaki sposob dzielimy stringa
        for(String word : inPut.split( " "))
        {
            listOWords.add( word );
        }
        System.out.println("");
        System.out.println("Ilosc slow: <" + listOWords.size() + "> "  );
        for(int i =0; i < listOWords.size(); i++)
        {
           numberOfChar += listOWords.get( i ).length();
           temporary = listOWords.get( i ).length();
           if(i==0)
           {
               wordWithMinNumberOfChar = temporary;
               wordWithMaxNumberOfChar = temporary;
           }
           if(temporary > wordWithMaxNumberOfChar)
           {
               wordWithMaxNumberOfChar = temporary;
           }
           else if(temporary < wordWithMinNumberOfChar)
           {
               wordWithMinNumberOfChar = temporary;
           }
        }
        System.out.println("Ilosc znakow: <" + numberOfChar + "> ");
        avarage = (numberOfChar / listOWords.size());
        System.out.println("Srednia dlugosc slowa: " + avarage);
        System.out.println("Najdluzsze slowo: " + wordWithMaxNumberOfChar);
        System.out.println("Najkrotsze slowo: " + wordWithMinNumberOfChar);

    }
}
