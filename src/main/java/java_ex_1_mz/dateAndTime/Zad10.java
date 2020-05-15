package java_ex_1_mz.dateAndTime;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad10 {
    ZoneId zone1 = ZoneId.of("Europe/Berlin");
    LocalDate localDate = LocalDate.now(zone1);

    public Zad10()
    {
        showData();
    }

    public void showData()
    {
        System.out.println("Aktualna data: " + localDate);
    }
}
