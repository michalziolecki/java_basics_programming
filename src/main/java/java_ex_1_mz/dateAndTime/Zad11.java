package java_ex_1_mz.dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad11 {

    private LocalDateTime localDateTime;

    public Zad11()
    {
        this.localDateTime = LocalDateTime.now();
        showDataTime();
    }

    public void showDataTime()
    {
        System.out.println("11. Aktualny czas: " + localDateTime);
    }
}
