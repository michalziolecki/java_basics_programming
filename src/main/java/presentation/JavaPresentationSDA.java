package presentation;

public class JavaPresentationSDA {
    public static void main(String[] args) {
//        int a;
//        float b; // typ prymitywny - przechowoje tylko dane
//        String c; // typ złożony - klasa - przechowuje dane i metody
        String name = "Michał";
        String name2 = "Michał"; // ten sam adres co name
        // operator 'new' zmusza jave do zarezerwowania nowej pamieci
        String name3 = new String("Michał"); // inny nowy adres w stosunku do name i name2
        String name4 = "Łukasz";

        System.out.println("name.equals(name2): " + name.equals(name2) ); // TRUE
        System.out.println("name.equals(name3): " + name.equals(name3) ); // TRUE
        // name i name2 są dosłownie identyczne nie tylko pod kątem litere ale też pozycji w pamięci
        System.out.println("name == name2: " + (name == name2) ); // TRUE
        System.out.println("name == name3: " + (name == name3) ); // FALSE
        System.out.println("name address: " +  System.identityHashCode(name));
        System.out.println("name2 address: " +  System.identityHashCode(name2));
        System.out.println("name3 address: " +  System.identityHashCode(name3));

        String nameWithoutA = name.replaceAll("a", "o");
        System.out.println("nameWithoutA: " +nameWithoutA);

    }
}

