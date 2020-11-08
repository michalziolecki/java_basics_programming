package presentation;

public class ClassTraining {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red",
                "CB 007", 18); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar); // konkretna instancja obiektu typu Car
        System.out.println(myCar.type);
        System.out.println(myCar.id);
        System.out.println(myCar.sizeWheel);
        System.out.println(myCar.color);
        System.out.println(myCar.productionDate);

        Car myCar2 = new Car("Toyota", "White",
                "CB 008", 15);

    }
}
