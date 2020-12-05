package presentation;

public class Auto {
    // pola ustawiane domyslnie - te wartosci sa juz
    // przed wywolaniem konstruktora gotowe do przypisania do obiektu
    // krok 0
    private String color;
    private String brand;

    public Auto() {
        this.color = "pink";
        this.brand = "porschee";
    }

    public Auto(String color, String brand) { // przeciazanie konstruktora
        this.color = color;
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //    @Override
//    public String toString() {
//        return "Auto attributes => Color: '" + this.color + "', brand: '" +  this.brand + "'";
//    }
}
