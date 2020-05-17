package java_exercises_1_sda.Ex11;

public class Dog  implements Animal{

    private String sound;

    public Dog(){
        this.sound = "Hau";
    }

    public String makeSound() {
        return this.sound;
    }
}
