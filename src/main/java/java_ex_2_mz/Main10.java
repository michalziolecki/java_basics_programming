package java_ex_2_mz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class Main10 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        Zad10 zad10 = new Zad10();
        String inPutString = null;
        long idNumber = 0;
        boolean test = false;

        while(true)
        {
            System.out.println("Write your ID number: ");
            inPutString = scanner.nextLine();
            Pattern pattern = Pattern.compile( "([0-9]{2})(([8|9]{1}[0-9]{1})|([0|1]{1}[0-9])|([2|3]{1}[0-9]{1}))" +
                    "([0-3]{1}[0-9]{1})"+"([0-9]{3})" + "([0-9]{1})" + "([0-9]{1})" );
            Matcher matcher = pattern.matcher( inPutString );
            test = matcher.matches();

            if(test == true) {
                System.out.println("test: " + test);
                idNumber = Long.parseLong( inPutString );
                zad10.printInformationFromIdNumber( idNumber );
                break;
            }
        }

        //System.out.println(idNumber);

    }
}
