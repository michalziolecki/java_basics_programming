package java_ex_1_mz.dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad9 {

    ZoneId zone1 = ZoneId.of("Europe/Berlin");
    private LocalTime localTime = LocalTime.now(zone1);

    public Zad9()
    {
        showTime();
    }

    public void showTime()
    {
        System.out.println("localTime " + localTime);
    }

}
