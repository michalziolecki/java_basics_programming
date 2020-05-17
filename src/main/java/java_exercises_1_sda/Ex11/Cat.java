package java_exercises_1_sda.Ex11;

public class Cat implements Animal {

    private String sound;

    public Cat(){
        this.sound = "Miauu";
    }

    public String makeSound() {
        return this.sound;
    }
}