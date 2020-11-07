package presentation;

public class ExampleTwo {
    int myGlobal = 12;
    void someMethod() {
        final int number = 1;
        // tutaj można użyć zmiennej myGlobal
        System.out.print("My global variable: " + myGlobal);
    }

    void someExampleMethod() {
        int a = 0;
        if (1 == 1 ) {
            a = 1;  // zmienna lokalna zadeklarowana wewnątrz instrukcji sterującej - zasięg tylko wewnątrz tej instrukcji
        }
        for (int i = 0; i < 10; i++) {
            a = a + i;
            // zasięg zmiennej 'i' jdynie wewnątrz tej pętli
        }
        a = 5;
        boolean myFalseValue = false; // false = 0
        boolean myTrueValue = true; // true = 1
    }
}
