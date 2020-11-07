package presentation;

import java.util.*;

public class ListTraining {

    public static void exList(){
        //int[]
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Michal");
        listOfNames.add("Sara");
        listOfNames.add("Kajetan");
        System.out.println("size before: " + listOfNames.size());
        listOfNames.add("Michal");
        System.out.println("size before: " + listOfNames.size());

    }

    public static void exSet(){
        //int[]
        Set<String> setOfNames = new HashSet<String>();
        setOfNames.add("Michal");
        setOfNames.add("Sara");
        setOfNames.add("Kajetan");
        System.out.println("size before: " + setOfNames.size());
        setOfNames.add("Michal");
        System.out.println("size before: " + setOfNames.size());
    }

    public static void exMap(){
        //int[]
        Map<Integer,String> mapOfNames = new HashMap<Integer, String>();
        mapOfNames.put(1, "Michal");
        mapOfNames.put(2, "Sara");
        mapOfNames.put(3, "Kajetan");
        System.out.println(mapOfNames.get(3));
        System.out.println("size before: " + mapOfNames.size());
        mapOfNames.put(3, "Michal");
        System.out.println("size after: " + mapOfNames.size());
        System.out.println(mapOfNames.get(3));

    }

    public static void exampleListInterface(){
        // interfejs a implementcja
        // interfejs pozwala nam wiedziec jakie sa zawsze tak samo nazwane i dzialajace metody
        List<String> asArray = new ArrayList<String>();
        List<String> asReference = new LinkedList<>();


        // Pozdro Mike
        // List<String> asList = new List<>(){....}; nie mozna zrobic obiektu interfejsu wiec trzeba uzupelnic metody i jest to klasa anonimowa bez pliku i nazwy
        List<String> myList = new MyList<>(); // = new List<>(){....}; anonimowa => skrócona wersja new MyList<>() w osobnym pliku
        myList.size(); // trzeba napisac zawartosc
    }

    public static void main(String[] args){
        System.out.println("List:");
        exList();
        System.out.println("Set:");
        exSet();
        System.out.println("Map:");
        exMap();

    }
}
