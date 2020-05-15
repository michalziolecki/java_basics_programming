package java_ex_1_mz.dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad13 {
    LocalTime localTime1;
    LocalTime localTime2;


    public Zad13()
    {
        this.localTime1 = LocalTime.of( 14, 11, 00 );
        this.localTime2 = LocalTime.of( 18, 41, 00 );
        durationOfTime();
    }

    public void durationOfTime()
    {
        // porownuje czas miedzy datami
        Duration duration = Duration.between( localTime1,localTime2 );
        System.out.println("13.Czas miedzy godzinami to: " + duration);
    }
}
