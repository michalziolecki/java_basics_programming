package java_ex_1_mz.oop;

/**
 * Created by Michal Ziolecki.
 */
public class Zad20_21_25_27Address {

    //Zadanie20 - pola
    String street, city, country;
    int flatNO, homeNO;

    //Zadanie21 - Konstruktor przyjmujacy wszystkie parametry

    public Zad20_21_25_27Address(String street, String city, String country, int flatNO, int homeNO) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.flatNO = flatNO;
        this.homeNO = homeNO;
    }

    //Zadanie 25 i 27 - getery i setery

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFlatNO() {
        return flatNO;
    }

    public void setFlatNO(int flatNO) {
        this.flatNO = flatNO;
    }

    public int getHomeNO() {
        return homeNO;
    }

    public void setHomeNO(int homeNO) {
        this.homeNO = homeNO;
    }

    @Override
    public String toString() {
        return "Address {" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", flatNO=" + flatNO +
                ", homeNO=" + homeNO +
                '}';
    }
}
