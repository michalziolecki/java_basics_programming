package presentation;

import java.util.regex.Pattern;

public class RegexTraining {

    // only simple checking - without sex, control sum etc
    public static boolean isIdCorrect(String id){
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(id).matches();
    }

    public static boolean isEmail(String email){
        Pattern emailPattern = Pattern.compile("[0-9a-z_\\.\\-]+@[0-9a-z_\\.\\-]+");
        return emailPattern.matcher(email).matches();
    }

    public static void main(String[] args){
        System.out.println("is id correct: " + isIdCorrect("92010101077")); // true -  dl = 11
        System.out.println("is id correct: " + isIdCorrect("920101010773")); // false - dl = 12
        System.out.println("is email correct: " + isEmail("aaa.bbb@gmail.com"));
    }
}
