package presentation;

public class ClassTraining {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red",
                "CB 007", 18); // wywolanie konstruktora przez 'new Car()'
        System.out.println(myCar); // konkretna instancja obiektu typu Car
        System.out.println(myCar.getType());
        System.out.println(myCar.getId());
        System.out.println(myCar.getSizeWheel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getProductionDate());
//        System.out.println(myCar.);
        System.out.println(myCar.runCar());

        Car myCar2 = new Car("Toyota", "White",
                "CB 008", 15);


    }
}
