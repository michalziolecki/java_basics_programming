package java_exercises_3_sda.exFrom11To13;

public class Rectangle implements Figure{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double getArea(){
        return this.height * this.width;
    }
}
