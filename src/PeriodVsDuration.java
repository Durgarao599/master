import java.time.LocalDate;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodVsDuration {

    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.of(2020, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2021, 7, 20);

        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        System.out.println("periodBetween "+periodBetween);	// P1Y4M8D

        System.out.println("getDays "+periodBetween.getDays());		//8
        System.out.println("getMonths "+periodBetween.getMonths());		//4
        System.out.println("getYears "+periodBetween.getYears());		//0

        System.out.println(periodBetween.get(ChronoUnit.DAYS));



        Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
        Instant end = Instant.parse("2017-10-03T10:16:30.00Z");

        Duration duration = Duration.between(start, end);
        System.out.println("getSeconds "+duration.getSeconds());		//8
        System.out.println("getNano "+duration.getNano());		//8

        LocalDateTime a = LocalDateTime.now();
        LocalDateTime b= a.plusSeconds(20);


        Duration d= Duration.between(a ,b);

        System.out.println("Durgation "+d.getSeconds());

        LocalDate currentDate= LocalDate.now();
        currentDate.plusDays(1);

        System.out.println("Period "+ Period.between(currentDate, currentDate.plusDays(1)).getMonths());



    }
}
