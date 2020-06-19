package java_exercises_3_sda;

public class Ex2 {

    public static void ex2(){
        Cat[] cats = new Cat[3];
        cats[0] =  new Cat("czikita");
        cats[1] =  new Cat("antoni");
        cats[2] =  new Cat("heheszek");
        for(Cat cat : cats){
            System.out.println(cat.makeSound());
        }
    }
}
