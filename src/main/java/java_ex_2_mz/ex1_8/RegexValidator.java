package java_ex_2_mz.ex1_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class RegexValidator {

    public boolean checkInPut(String inPutString)
    {
        /**
         * This method testing seuqenses of input. If it is number, return true
         */
        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher( inPutString );
        boolean test = m.matches();
        //System.out.println(test);

        return test;
    }

    public boolean checkAddresCode(String inPutString)
    {
        Pattern pattern = Pattern.compile("\\d{1,3}[a-z]?[-]\\d{1,3}");
        Matcher m = pattern.matcher( inPutString );
        boolean test = m.matches();
        return test;
        //System.out.println(test);
    }

    public boolean checkLogin(String inPutString)
    {
        Pattern pattern = Pattern.compile( "[[a-z][A-Z][0-9]]{8,16}$" );
        Matcher matcher = pattern.matcher( inPutString );
        boolean test = matcher.matches();

        return test;
    }

    public boolean checkAlaConfiguration(String inPutString)
    {
        Pattern pattern = Pattern.compile( ".*ala.*" );
        Matcher matcher = pattern.matcher( inPutString );
        boolean test = matcher.matches();
        return test;
    }

    public boolean checkDate(String inPutString)
    {
        Pattern pattern = Pattern.compile( "\\d{1,2}\\."+"\\d{1,2}\\."+"\\d{1,4}" );
        Matcher matcher = pattern.matcher( inPutString );
        boolean test = matcher.matches();
        return test;
    }
    public boolean checkSerialNumber(String inPutString)
    {
        Pattern pattern = Pattern.compile( "[A-Z]{3}[1-9]{5}[a-z]{1}[A-Z]{1}" );
        Matcher matcher = pattern.matcher( inPutString );
        boolean test = matcher.matches();
        return test;
    }

    public boolean checkSerialNumberOfProgram(String inPutString)
    {
        Pattern pattern = Pattern.compile( "[A-Z|\\&]{5}-[A-Z|0-9]{5}-[A-Z|0-9]{5}-[A-Z|0-9]{5}-[A-Z|0-9]{5}" );
        Matcher marcher = pattern.matcher( inPutString );
        boolean test = marcher.matches();
        return test;
    }

    public boolean checkFacture(String inPutString)
    {
        // regex "[F][V][/][0-9]{1,4}[/][0-3]{1}[0-9]{1}[/][2][0][1][8]"
        Pattern pattern = Pattern.compile( "^FV[/]([1-9]{1}[0-9]{0,3})[/](([0]{1}[1-9]{1})|([1]{1}[0-2]{1}))[/]2018" );
        Matcher marcher = pattern.matcher( inPutString );
        boolean test = marcher.matches();
        return test;
    }

}
//NOTATKI Z NAUKI
//        Pattern patt = Pattern.compile("\\d+");
//        Boolean bool = patt.matcher( inPutString ).matches();
//        System.out.println("wynik operacji: " + bool);

//        ? 0 lub 1
//        + 1 lub n
//        * 0 lub n
//        {1} raz
//        {1,5} od 1 do 5 <1,5>

        //adres 33/44, 1/345, 33a/11
//        Pattern patt = Pattern.compile("\\d{1,2}[a-z]?/\\d{1,3}");
//        Boolean bool = patt.matcher( "33a/11").matches();
//        System.out.println("wynik operacji: " + bool);

        //adres 33/44, 1/345
//        Pattern patt = Pattern.compile("\\d{1,2}/\\d{1,3}");
//        Boolean bool = patt.matcher( 33/345 ).matches();
//        System.out.println("wynik operacji: " + bool);

//        Pattern patt = Pattern.compile("\\d{2,5}");
//        Boolean bool = patt.matcher( "45" ).matches();
//        System.out.println("wynik operacji: " + bool);
        //
//        inPutString = scanner.nextLine();
//        Pattern pattern = Pattern.compile("[0-9+]");
//        Matcher m = pattern.matcher( inPutString );
//        boolean test = m.matches();
//        System.out.println(test);

