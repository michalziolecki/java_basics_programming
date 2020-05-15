package java_ex_2_mz;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class Main11 {

    public static void main(String[] args) {

        //do listowania i wczytywania
        Path path = Paths.get( "C:/Users/Właściciel/Desktop/java SDA", "Zad.txt" );
        Charset charset = Charset.forName("ISO-8859-2");
        List <String> lines = null;
        List <String> listOfWord = new ArrayList <>(  );
        List<Zad11> listOfPerson = new ArrayList <>(  );

        // do sprawdzania regex
        boolean nameAndSurname = false;
        boolean sex = false;
        boolean dateOfBirthDay = false;
        boolean personIdNumber = false;

        try {
            lines = Files.readAllLines( path, charset );

            //test wczytywania
            for (String line : lines) {
                System.out.println( line );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // czytam linie po linii
        for(String item : lines)
        {
            Zad11 zad11 = new Zad11(  );
            //rozbijam linie na slowa i zapisuje do nowej listy
            int counter = 0;
            for(String item2: item.split( " " )) {
                //listOfWord.add( item2 );
                nameAndSurname = patternNameAndSurname( item2 );
                sex = patternSex( item2 );
                dateOfBirthDay = patternDateOfBirthDay( item2 );
                personIdNumber = patternPersonIdNumber( item2 );

                if(counter%5 == 0 && nameAndSurname == true){
                    zad11.setName( item2 );
                }
                else if (counter%5 == 1 && nameAndSurname ==true){
                    zad11.setSurname( item2 );
                }
                if(sex==true)
                {
                    zad11.setSex( item2 );
                }
                if(dateOfBirthDay == true)
                {
                    zad11.setDateOfBirth( item2 );
                }
                if(personIdNumber == true)
                {
                    zad11.setNIN( item2 );
                }
                counter++;
            }
            listOfPerson.add( zad11 );

        }

        for(Zad11 item: listOfPerson)
        {
            System.out.println(item.toString());
        }


    }

    public static boolean patternNameAndSurname(String item)
    {
        boolean test = false;
        Pattern pattern = Pattern.compile( "([A-Z]|[a-z]){3,20}" );
        Matcher matcher = pattern.matcher( item );
        test = matcher.matches();
        return test;
    }

    public static boolean patternSex(String item)
    {
        boolean test = false;
        Pattern pattern = Pattern.compile( "[M|F]{1}" );
        Matcher matcher = pattern.matcher( item );
        test = matcher.matches();
        return test;
    }

    public static boolean patternDateOfBirthDay(String item)
    {
        boolean test = false;
        Pattern pattern = Pattern.compile( "([0-3]{1}[0-9]{1})\\.(([0]{1}[1-9]{1})|([1]{1}[0-2]{1}))\\.([0-9]){4}" );
        Matcher matcher = pattern.matcher( item );
        test = matcher.matches();
        return test;
    }

    public static boolean patternPersonIdNumber(String item)
    {
        boolean test = false;
        Pattern pattern = Pattern.compile( "(\\d{11})" );
        Matcher matcher = pattern.matcher( item );
        test = matcher.matches();
        return test;
    }
}
