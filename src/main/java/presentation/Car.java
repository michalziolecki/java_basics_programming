package presentation;

import java.sql.Date;
import java.time.LocalDate;

public class Car { // extends Object
    // attributes / fields
    // encapsulation - ochrona danych w klasie
    private String type; // = null;
    private String color; // = null;
    private String id;
    private Date productionDate;
    //    public int sizeWheel; // primitive type
    private Integer sizeWheel; // object type

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

    public String getType() {
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
}
