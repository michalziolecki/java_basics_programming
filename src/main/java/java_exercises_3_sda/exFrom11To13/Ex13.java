package java_exercises_3_sda.exFrom11To13;

public class Ex13 {
    public static boolean isEnought(Figure[] figures, Double possibleArea){
        Double area = 0.0;
        for (Figure figure : figures){
            area += figure.getArea();
        }
        return area <= possibleArea;
    }
}
