package java_exercises_3_sda;

//ex8 i 9
public class Vet {

    public void sayHello(Cat cat){ //ex8
        System.out.println("Witaj " + cat.getName());
    }

    public void sayHello(Dog dog){ //ex9
        System.out.println("Witaj " + dog.getName());
    }

    public void sayHelloToAnimal(Animal animal){ //ex10
        System.out.println("Witaj " + animal.getName());
    }
}
