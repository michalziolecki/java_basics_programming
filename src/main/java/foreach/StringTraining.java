package foreach;

public class StringTraining {


    public static void main(String[] args){
        String a = "a";
        String b = "a";
        String c = new String("a");

        // test
        System.out.println("a == b: " + Boolean.toString(a == b));
        System.out.println("a.equals(c): " + Boolean.toString(a.equals(c)));
        System.out.println("b == c: " + Boolean.toString(b == c));

        // adresy lańcuchów w pamięci
        System.out.println("a address: " + System.identityHashCode( a ));
        System.out.println("b address: " + System.identityHashCode( b ));
        System.out.println("c address: " + System.identityHashCode( c ));
    }
}
