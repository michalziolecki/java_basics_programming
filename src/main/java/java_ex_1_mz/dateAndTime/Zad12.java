package java_ex_1_mz.dateAndTime;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad12 {
    LocalDate localDate1;
    LocalDate localDate2;


    public Zad12()
    {
        this.localDate1 = LocalDate.of( 2017, 01, 01 );
        this.localDate2 = LocalDate.of( 2017, 05, 05 );
        perioOfTime();
    }

    public void perioOfTime()
    {
        // porownuje czas miedzy datami
        Period period = Period.between( localDate1,localDate2 );
        System.out.println("12.Czas miedzy datami to: " + period);
    }
}
