package java_exercises_3_sda.exFrom11To13;

public class Cirle implements Figure{
    private Double radius;

    public Cirle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
