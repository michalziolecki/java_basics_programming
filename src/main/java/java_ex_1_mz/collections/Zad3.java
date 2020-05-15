package java_ex_1_mz.collections;

import java.util.ArrayList;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad3 {
    private ArrayList<Double> listOfDouble = new ArrayList <Double>( );

    public Zad3()
    {
        InsertIntoList();
        showList();
    }

    public void InsertIntoList()
    {

        System.out.println("3.Dodaje do ArrayList");
        //0.5, 1.5 , 2.5, 3.5, 4.5 , 5.5, 6.5 , 7.5, 8.5 ,9.5
        for(int i = 0 ; i < 10 ; i++)
        {
            listOfDouble.add( i+0.5 );
        }
    }

    public void showList()
    {
        double sum;
        sum = listOfDouble.get( 0 ) + listOfDouble.get( listOfDouble.size()-1 );
        System.out.println("3a. pierwszy + ostatni = " + sum);
        sum = listOfDouble.get( 0 ) * listOfDouble.get( listOfDouble.size()-1 );
        System.out.println("3b. pierwszy * ostatni = " + sum);
        sum = listOfDouble.get( 1 ) / listOfDouble.get( listOfDouble.size()-2 );
        System.out.println("3c. pierwszy / ostatni = " + sum);

    }
}
