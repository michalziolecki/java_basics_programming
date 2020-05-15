package java_ex_1_mz.oop;

/**
 * Created by Michal Ziolecki.
 */
public abstract class Zad32_34AbstractCar {
    //Zadanie 32 - pola w klasie abstrakcyjnej
    String procedur;
    String model;
    String color;
    int seatsNumber;
    String engine;

    //Zadanie 34 konstruktor bezparametrowy inicjalizujacy seatsNumber =2
    public Zad32_34AbstractCar()
    {
        this.seatsNumber = 2;
    }

    //do zadania 36
    public Zad32_34AbstractCar(String procedur, String model, String color)
    {
        this.procedur = procedur;
        this.model = model;
        this.color = color;
    }



}
