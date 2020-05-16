package java_exercises_1_sda.Ex11;

import java_exercises_1_sda.TablePrinter;

public class MainAnimals {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Animal[] animals = {cat, dog, cow};

        for(Animal animal: animals){
            System.out.println(animal.makeSound());
        }

    }

}
