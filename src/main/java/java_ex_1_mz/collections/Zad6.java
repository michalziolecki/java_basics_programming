package java_ex_1_mz.collections;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad6 {

    private int inPutNumber, randomNumber;
    private String numberInString;
    Scanner inPut= new Scanner( System.in );
    Random randomGenerator =  new Random();
    PriorityQueue<Integer> priorityQueue = new PriorityQueue <>(  );

    public Zad6()
    {
        enterNumberAndRandom();
    }

    public void enterNumberAndRandom(){

        System.out.println("6a.Write here number to random: ");
        numberInString = inPut.nextLine();
        inPutNumber = Integer.parseInt( numberInString );
        System.out.println("Wprowadziles liczbe: " + inPutNumber);

        System.out.println("6b. So.. it's time to choose " + inPutNumber + " numbers: ");
        for(int i = 0; i < inPutNumber; i++)
        {
            randomNumber = randomGenerator.nextInt(100) + 1 ;
            priorityQueue.add( randomNumber );
            System.out.println("Add to priority queue new number: " + randomNumber);
        }
        System.out.println("6c. Now, time to show number from queue: ");
        int iterator = 1;
        while(!priorityQueue.isEmpty())
        {
            System.out.println(iterator + ". w kolejce " + priorityQueue.poll());
            iterator ++;
        }

    }

}
