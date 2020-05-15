package java_ex_2_mz;

/**
 * Created by Michal Ziolecki.
 */
public class Zad10 {

    int day, month, year , serialNumber, sexInt;
    long  controlNumber ;
    String sex, dayS, yearS, monthS, serialNumberS;

    public Zad10(){}

    public void printInformationFromIdNumber(long idNumber)
    {
        System.out.println("Your idNumber: " + idNumber);
        //--- contol naumber [10]
        controlNumber = idNumber%10;
        idNumber = idNumber/10;
        // sex [9]
        sexInt = (int)idNumber%10;
        idNumber = idNumber/10;
        if(sexInt%2 == 0) sex = "K";
        else sex = "M";
        //--- serial number [6-8]
        serialNumber = (int)idNumber%1000;
        if(serialNumber < 100) serialNumberS = "0" + serialNumber;
        else serialNumberS = "" + serialNumber;
        idNumber = idNumber/1000;
        //--- day month year [0-5]
        day = (int)idNumber%100;
        if(day < 10) dayS = "0" + day;
        else dayS = "" + day;
        idNumber = idNumber/100;
        month = (int)idNumber%100;
        idNumber = idNumber/100;
        year = (int)idNumber%100;
        if(month > 81)
        {
            yearS = "18" + year;
            month = month - 80;
        }
        else if (month > 0 && month < 13)
        {
            yearS = "19" + year;
        }
        else if(month > 20 && month < 33)
        {
            yearS = "20" + year;
            month = month - 20;
        }
        switch (month)
        {
            case 1:  monthS = "January";
                break;
            case 2:  monthS = "February";
                break;
            case 3:  monthS = "March";
                break;
            case 4:  monthS = "April";
                break;
            case 5:  monthS = "May";
                break;
            case 6:  monthS = "June";
                break;
            case 7:  monthS = "July";
                break;
            case 8:  monthS = "August";
                break;
            case 9:  monthS = "September";
                break;
            case 10: monthS = "October";
                break;
            case 11: monthS = "November";
                break;
            case 12: monthS = "December";
                break;
            default: monthS = "Invalid month";
                break;
        }
        System.out.println("Data urodzenia: "  + "\n dzień: " + dayS + "\n miesiac: " + monthS
                + "\n rok: " + yearS + "\n Numeri serii: " + serialNumberS + "\n Plec: " + sex + "\n Cyfra kontrolna: "
                + controlNumber);

    }
}
