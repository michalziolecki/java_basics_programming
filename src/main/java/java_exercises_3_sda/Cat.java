package java_exercises_3_sda;

//Ex1 i Ex3 i ex7
public class Cat implements Animal, Movable{

    private String name; //Ex1
    private int mouseCounter;  //Ex3

    public Cat(String name){
        this.name = name; //Ex1
        this.mouseCounter = 0; //Ex3
    }

    public String getName() {
        return name; //ex8
    }

    @Override
    public String makeSound(){ //Ex1
        return this.name + ": Miauuu";
    }

    public void eatMouse(){ //Ex3
        this.mouseCounter++;
        System.out.println("Zjadłem " + this.mouseCounter + " myszy");
    }

    @Override
    public String move() { //ex7
        System.out.println("ide");
        return "ide";
    }
}


