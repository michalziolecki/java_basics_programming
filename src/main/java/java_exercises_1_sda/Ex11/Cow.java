package java_exercises_1_sda.Ex11;

public class Cow implements Animal {

    private String sound;

    public Cow(){
        this.sound = "Muu";
    }

    public String makeSound() {
        return this.sound;
    }
}
