package presentation;

public class TablePresentation {
    public static void main(String[] args) {
        String[] imiona = new String[4];
        imiona[0] = "Jan"; // zapisywanie do  komórki tablicy
        imiona[3] = "roman";
        String name0 = imiona[0]; // odczytywanie z komórki tablicy
        for (int i = 0; i < imiona.length; i++) {
            System.out.println("Element o indexie [" + i + "]: " + imiona[i]);
        }
    }
}
