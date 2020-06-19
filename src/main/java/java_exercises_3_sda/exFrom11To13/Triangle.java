package java_exercises_3_sda.exFrom11To13;

public class Triangle implements Figure {
    private Double height;
    private Double base;

    public Triangle(Double height, Double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public Double getArea(){
        return 0.5 * this.height * this.base;
    }
}
