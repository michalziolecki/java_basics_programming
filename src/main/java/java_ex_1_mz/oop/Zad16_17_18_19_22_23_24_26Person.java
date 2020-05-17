package java_ex_1_mz.oop;

/**
 * Created by Michal Ziolecki.
 */
public class Zad16_17_18_19_22_23_24_26Person {

    //Zadanie 16 - pola
    private String name;
    private String surname;
    private int age;
    //Zadanie 22 - pole z klasa Address
    Zad20_21_25_27Address address;

    //Zadanie 17 - konstruktor bezparametrowy
    public Zad16_17_18_19_22_23_24_26Person()
    {

    }
    //Zadanie 18 - konstruktor parametrowy
    public Zad16_17_18_19_22_23_24_26Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    //Zadanie 23 - nowy kontruktor z Address
    public Zad16_17_18_19_22_23_24_26Person(String name, String surname, int age, Zad20_21_25_27Address InPutAddress)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = InPutAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Zad20_21_25_27Address getAddress() {
        return address;
    }

    public void setAddress(Zad20_21_25_27Address address) {
        this.address = address;
    }

    public void introduce()
    {
        System.out.println("Name: " + name + ", Surmane: " + surname + ", age: " + age + ", Correspondence " + address);
    }
}
