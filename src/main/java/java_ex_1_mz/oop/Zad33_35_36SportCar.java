package java_ex_1_mz.oop;

/**
 * Created by Michal Ziolecki.
 */
//zadanie 33
public class Zad33_35_36SportCar extends Zad32_34AbstractCar{

    //zadanie 35
    public Zad33_35_36SportCar(String procedur, String model, String color, int seatsNumber, String engine) {
        this.procedur = procedur;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    //zadanie 36
    public Zad33_35_36SportCar(String procedur, String model, String color, int seatsNumber)
    {
        super(procedur,model,color);
        this.seatsNumber = seatsNumber;
    }


}
