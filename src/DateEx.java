import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date start =new Date(System.currentTimeMillis());

        Date exp =new Date(System.currentTimeMillis()+1000*60*30);

        System.out.println(start);
        System.out.println(exp);
      //  LocalDateTime start1 =LocalDateTime.now();
       // LocalDateTime end =LocalDateTime.now().minusDays(12345);
        LocalDateTime start1 = LocalDateTime.parse("2020-02-01T08:00:00");
        LocalDateTime end = LocalDateTime.parse("2023-01-01T01:00:00");

        System.out.println("start1 "+start1);

        System.out.println("end "+end);

        System.out.println("duration "+Period.between(start1.toLocalDate() ,end.toLocalDate()));
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime "+currentDateTime);
        LocalDateTime tenSecondsLater = currentDateTime.plusSeconds(10);
        Duration duration=  Duration.between(currentDateTime ,tenSecondsLater);
        Period period=  Period.between(currentDateTime.toLocalDate() ,currentDateTime.toLocalDate().plusDays(5));
        System.out.println("duration " +duration.getNano() +" " +duration.getSeconds());

        System.out.println("period.getDays() :: " +period.getDays());
    }
}
