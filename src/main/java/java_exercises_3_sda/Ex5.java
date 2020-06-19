package java_exercises_3_sda;

public class Ex5 {
    public static void ex5(){
        Animal[] animals = new Animal[4];
        animals[0] =  new Cat("czikita");
        animals[1] =  new Cat("antoni");
        animals[2] =  new Dog("beny");
        animals[3] =  new Dog("jeny");
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
        }
    }
}
