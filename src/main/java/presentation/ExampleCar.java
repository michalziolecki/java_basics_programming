package presentation;

public class ExampleCar { // extends Object
    private String color;
    private int maxSpeed;
    private String brand;
    private int horses;

    public void setColor(String c) { // String c = "red";
        this.color = c;
    }

    public void setMaxSpeed(int max) {
        maxSpeed = max; // ==  this.maxSpeed = max;  # this jest dopisywane przy kompilacji wiec mozna traktowac jako domyslne
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorses(int h) {
        horses = h;
    }

    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s, horses number: %d", color, maxSpeed, brand, horses));
    }

    @Override
    public String toString() {
        return String.format("TO_STR: Car color is: %s, max speed is: %d, car brand is: %s, horses number: %d", color, maxSpeed, brand, horses);
    }
}
