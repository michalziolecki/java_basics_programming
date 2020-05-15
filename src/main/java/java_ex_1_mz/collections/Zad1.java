package java_ex_1_mz.collections;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad1 {

    private int [] table = new int[10];

    public Zad1()
    {
        insterToTable();
        showTable();
    }

    public void insterToTable()
    {
        System.out.println("1a. Dodano do tablicy " + table.length + "elementow.");
        for( int i = 0; i < table.length; i++ ) table[i] = i + 1;
    }

    public void showTable()
    {
        System.out.println("1b. Table lenght:" + table.length);
        System.out.print("1c \n| ");
        for( int i = 0; i < table.length; i++ ) System.out.print( table[i] + " | ");
        System.out.print("\n1d+e \n| ");
        for( int i = 0; i < table.length; i++ )
        {
            table[i] = i*2;
            System.out.print( table[i] + " | ");
        }
    }

}
