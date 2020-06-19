package java_exercises_3_sda.exFrom11To13;

public class Ex12 {

    public static Double sumArea(Figure[] figures){
        Double area = 0.0;
        for (Figure figure : figures){
            area += figure.getArea();
        }
        return area;
    }

}
