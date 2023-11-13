import date.MicroWave;
import date.Program;

import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(ZonedDateTime.now());

//        LocalDate localDate = LocalDate.of(2016, Month.FEBRUARY, 20);
//        LocalTime localTime = LocalTime.of(5, 20);
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//
//        ZoneId zoneId = ZoneId.of("Asia/Hebron");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
//
//        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2016, 2, 20, 5, 20, 22, 55, zoneId);
//        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, zoneId);
//
////         for(String zone1 : ZoneId.getAvailableZoneIds()) {
////             System.out.println(zone1);
////         }
//
//        System.out.println(localDate.getYear() == localDate.getYear());
//        System.out.println(localDate.getMonth() == localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth() == localDate.getDayOfMonth());
//
//        System.out.println(localDateTime.getYear() == localDateTime.getYear());
//        System.out.println(localDateTime.getMonth() == localDateTime.getMonth());
//        System.out.println(localDateTime.getDayOfMonth() == localDateTime.getDayOfMonth());
//        System.out.println(localDateTime.getMinute());
//        System.out.println(localDateTime.getSecond());
//
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());
//
//        zonedDateTime1.getOffset().getTotalSeconds();
//
//       LocalDate localDate1 = localDate.minusDays(2);
//       LocalDate localDate2 = localDate.minusYears(2);
//
//        localTime = localTime.minusHours(2);
//        localTime = localTime.minusSeconds(2);
//
//        localTime = localTime.plusHours(2);
//        localTime = localTime.plusMinutes(2);
//        localTime = localTime.plusSeconds(2);
//
//        boolean isAfter = localDate.isAfter(localDate1);
//        boolean isBefore = localDate.isBefore(localDate1);
//
//        if(LocalTime.now().isAfter(localTime)) {
//            // execute
//        }
//
////       /  LocalTime localTime = LocalTime.of(5, 20, 30, 22);
//        LocalTime localTime1 = localTime.withHour(2).withMinute(20).withSecond(30).withNano(22);
//
////        localDateTime.withYear(2020).withMonth(20)
//
//
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);
//        System.out.println(zonedDateTime);


//        Program program1 = new Program(1, "Program 1", 1);
//        Program program2 = new Program(2, "Program 2", 2);
//        Program program3 = new Program(3, "Program 3", 3);
//        Program program4 = new Program(4, "Program 4", 10);
//
//
//        MicroWave microWave = new MicroWave();
//        microWave.addProgram(program1);
//        microWave.addProgram(program2);
//        microWave.addProgram(program3);
//        microWave.addProgram(program4);
//
////        microWave.displayPrograms();
//
//        microWave.selectProgram(4);

        MicroWave microWave = new MicroWave(5);
        microWave.start();
    }
}