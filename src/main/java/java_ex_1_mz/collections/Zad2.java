package java_ex_1_mz.collections;

import java.util.ArrayList;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad2 {

    private ArrayList<Integer> integerList = new ArrayList <>( );

    public Zad2 ()
    {
        addToList( 3 );
        showElementsList();
    }

    public void addToList(int howMany)
    {
        System.out.println("\n2a.Dodaje elementy do listy.");
        for(int i=0 ; i < howMany ; i++)
        {
            integerList.add( i );
        }
    }

    public void showElementsList()
    {
        System.out.println("2 b + c: ");
        System.out.println("Pierwszy elemnt: " + integerList.get( 0 ));
        System.out.println("Ostatni element: " + integerList.get( integerList.size()-1 ));
    }



}
