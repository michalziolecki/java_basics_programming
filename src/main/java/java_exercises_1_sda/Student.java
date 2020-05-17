package java_exercises_1_sda;

public class Student {

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private Integer age;
    private  String name;

    public Student(Integer agee, String namee){
        this.age = agee;
        this.name = namee;
    }

    public void print(){
        System.out.println("name: " + this.name);
    }

    public void older(){
        // NIE STATYCZNA
        this.age += 1;
    }

    public static void main (String[] args){
        Student uczen = new Student(23, "Fraciszek");
        uczen.print();
    }
}
