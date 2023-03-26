package Day27.Date_related_Prgram;

import java.util.*;

import javax.swing.SpinnerDateModel;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class local_date {
    public static void main(String[] args) {
        LocalDate ldate=LocalDate.now();
        ldate = LocalDate.of(2002,06,25);
        System.out.println("Intially local date is "+ldate);
        LocalDate.now(ZoneId.systemDefault());
        LocalDateTime lDatetime=LocalDateTime.now();
        System.out.println("Intiall local date time is "+lDatetime);
        lDatetime=LocalDateTime.of(2017,11,22,6,40);
        lDatetime = LocalDateTime.parse("2017-12-05T11:30:30");
        System.out.println("Local date time is "+lDatetime);
        LocalDateTime.now(ZoneId.systemDefault());
        Date date= Date.from(Instant.now());
        System.out.println("Date is "+date);
        ZoneId defaultZoneId=ZoneId.systemDefault();
        LocalDate localDate=date.toInstant().atZone(defaultZoneId).toLocalDate();
        System.out.println("LocalDate here is"+localDate);
        Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        Date datee = Date.from(Instant.now());
        System.out.println("Date is "+datee);
        ZoneId defaultZoneIdd = ZoneId.systemDefault();
        LocalDateTime localDateTime = datee.toInstant().atZone(defaultZoneIdd).toLocalDateTime();
        System.out.println("localdate time is"+localDateTime);
        Date out = Date.from(localDateTime.atZone(defaultZoneIdd).toInstant());
        System.out.println("out date is "+out);
        
    }
}
