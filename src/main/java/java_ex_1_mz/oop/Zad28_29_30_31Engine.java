package java_ex_1_mz.oop;

/**
 * Created by Michal Ziolecki.
 */
public class Zad28_29_30_31Engine {
    //Zad28 pola
    double capacity;
    int horsePower;
    double fuelConsumption;

    //Zad29 konstruktor

    public Zad28_29_30_31Engine(double capacity, int horsePower, double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    //Zad 30 setery
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    //Zad31 getery
    public double getCapacity() {
        return capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

}
