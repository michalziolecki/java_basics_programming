package java_ex_1_mz.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by Michal Ziolecki on $[DATE].
 */
public class Zad15 {

    ZoneId zoneId = ZoneId.of( "Europe/Paris" );
    LocalDateTime localDateTime = LocalDateTime.now(zoneId );
    LocalDate localDate = LocalDate.now(  );
    LocalTime localTime = LocalTime.now(  );


    public Zad15()
    {
        showCorectlyFormat();
    }

    public void showCorectlyFormat()
    {
        System.out.println("15.Przed formatowaniem: " + localDateTime  + "roku," );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( ", dd MMMM yyyy 'roku,' EEEE hh:mm:ss ", new
                Locale(
                "pl" ));
        String BydgosczDataAndTime = localDateTime.format(formatter);
        System.out.println("15.Data po formacie w string: "+ BydgosczDataAndTime );
    }
}
