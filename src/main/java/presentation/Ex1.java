package presentation;

public class Ex1 {

    public static void helloUser(String[] names){
        for(String name : names){
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args){
        String[] namesOfUser = {"Ela", "Janusz", "Grażyna"};
        helloUser(namesOfUser);
    }
}
