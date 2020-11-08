package presentation;

import java.sql.Date;
import java.time.LocalDate;

public class Car { // extends Object
    // attributes / fields
    // encapsulation - ochrona danych w klasie
    private String type; // = null; // NEVER EDIT
    private String color; // = null; // writing setter is correct
    private String id; // writing setter is correct
    private Date productionDate; // NEVER EDIT
    //    public int sizeWheel; // primitive type
    private Integer sizeWheel; // object type // writing setter is correct

    public Car() { // constructor
    }

            // String myType = "Toyota", String myColor = "Red",
    public Car(String myType, String myColor,
               // String id = "CB 007", Integer mySizeWheel = 18
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = Date.valueOf(LocalDate.now());
        this.sizeWheel = mySizeWheel;
    }

    public Car(String myType, String myColor,
               Date myDateProduction,
               String id, Integer mySizeWheel) { // constructor
        type = myType; // this.type
        this.color = myColor;
        this.id = id;
        this.productionDate = myDateProduction;
        this.sizeWheel = mySizeWheel;
    }

    @Override
    public String toString() {
        return "\n==== \n Car: " +  this.type + " \n id: " + this.id + "\n=== \n";
    }

    public String runCar(){
        return "\n ---\n" + this.type + " brum brum " + "\n ---\n" ;
    }

    // metody do odczytu danych czyli tzw gettry

    public String getType() {  // geter (czyli metoda zaczynajaca sie od get..) zwraca typ zgodny z typem pola
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getSizeWheel() {
        return sizeWheel;
    }

    public String getId() {
        return id; // this.id
    }

    public Date getProductionDate() {
        return productionDate;
    }

    // do edycji pól / ustawiania atrybutów sluża tzw settery

    // String color = "Blue"
    public void setColor(String color) { // seter nic nie zwraca bo ustawia pole
        this.color = color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSizeWheel(Integer sizeWheel) {
        this.sizeWheel = sizeWheel;
    }
}
