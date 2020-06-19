package java_exercises_3_sda;

//Ex4
public class Dog implements Animal {

    private String name; //Ex4

    public Dog(String name){
        this.name = name; //Ex4
    }

    public String getName() {
        return name;
    }

    @Override
    public String makeSound(){ //Ex4
        return this.name + ": Hauuu";
    }
}
