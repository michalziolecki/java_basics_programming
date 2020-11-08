package java_ex_1_mz.dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad9 {

    public Zad9(){
        showTime();
    }

    public static void showTime()
    {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        LocalTime localTime = LocalTime.now(zone1);
        System.out.println("localTime " + localTime);
    }

    public static void main(String[] args) {
        showTime();
    }

}
