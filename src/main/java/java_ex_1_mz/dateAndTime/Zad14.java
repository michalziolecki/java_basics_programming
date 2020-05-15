package java_ex_1_mz.dateAndTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad14 {
    ZoneId zone1 = ZoneId.of("Asia/Tokyo");
    private LocalDateTime localDateTime;

    public Zad14()
    {
        this.localDateTime = LocalDateTime.now( zone1 );
        showDataAndTime();
    }

    public void showDataAndTime()
    {
        System.out.println("14. Aktualna data i czas w Tokio: " + localDateTime);
    }
}
