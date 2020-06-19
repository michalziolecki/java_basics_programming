package java_exercises_3_sda;

import java_exercises_3_sda.exFrom11To13.Ex13;
import java_exercises_3_sda.exFrom11To13.Figure;
import java_exercises_3_sda.exFrom11To13.Rectangle;
import java_exercises_3_sda.exFrom11To13.Triangle;

public class Main {

    public static void main(String[] args){
        //Ex2
        Ex2.ex2();
        System.out.println("======");
        //Ex5
        Ex5.ex5();
        System.out.println("======");


        //ex13
        Rectangle rectangle = new Rectangle(2.0, 2.0);
        Triangle triangle = new Triangle(2.0, 2.0);
        Figure[] figures = {rectangle, triangle};
        System.out.println(Ex13.isEnought(figures, 8.0));
    }
}
