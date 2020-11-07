package java_exercises_1_sda;

public class Student {

    private Integer age;
    private String name;

    public Student(Integer agee, String namee){
        this.age = agee;
        this.name = namee;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void print(){
        System.out.println("age: " + this.age);
    }

    public void older(){
        // NIE STATYCZNA
        this.age += 1;
    }

    public static void main (String[] args){
        Student uczen = new Student(23, "Fraciszek");
        System.out.println(uczen.getAge());
        System.out.println(uczen.getName());
        uczen.print();
        uczen.setAge(28);
        uczen.print();
        uczen.older();
        uczen.print();
    }
}
