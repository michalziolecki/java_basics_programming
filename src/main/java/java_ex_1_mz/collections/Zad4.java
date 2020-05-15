package java_ex_1_mz.collections;

import java.util.ArrayList;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad4 {
    ArrayList<String> listOfName = new ArrayList <>(  );

    public Zad4()
    {
        addToList();
        showList();
    }

    public void addToList()
    {
        System.out.println("4a.Dodaje do listy");
        listOfName.add( "Maciej" );
        listOfName.add( "Michal" );
        listOfName.add( "Sara" );
        listOfName.add( "Stefan" );
        listOfName.add( "Eustachy" );
    }

    public void showList()
    {
        System.out.println("4b. Kolejno elementy z listy:");
        for(String interator : listOfName)
        {
            System.out.print(interator + " | ");
        }

        System.out.println("\n4c. Kolejno elementy z listy od konca:");
        for(int i = listOfName.size()-1; i >= 0; i-- )
        {
            System.out.print(listOfName.get( i ) + " | ");
        }
    }


}
