import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTime1 {
	public static void main(String[] args) {
		/*Local date = data sem hora
		 * LocalTime = hora
		 * LocalDateTime = data com hora
		 * MonthDay = dia do mes
		 * YearMonth = mes e ano*/
		
		/*Data de agora*/
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(d);
		System.out.println(t);
		System.out.println(ldt);
		
		/*Fuso horario*/
		LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
		LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println(t1);
		System.out.println(t2);
		System.out.println();
		
		//
		LocalTime meioDia = LocalTime.of(12, 0);
		LocalDate natal2014 = LocalDate.of(2014, 12, 25);
		LocalDate natal2015 = LocalDate.of(2014, Month.DECEMBER, 25);
		System.out.println(meioDia);
		System.out.println(natal2014);
		System.out.println(natal2015);
		System.out.println();
		
		LocalDateTime algumMomento = LocalDateTime.of(2050, Month.AUGUST, 23, 6, 0);
		System.out.println(algumMomento);
		System.out.println();
		
		LocalDateTime ceiaDeNatal = LocalDateTime.of(natal2015, meioDia);
		System.out.println(ceiaDeNatal);
		System.out.println();
		
		LocalDateTime ltd2 = LocalDateTime.of(2023, 12, 23, 6, 0);
		System.out.println(ltd2.getDayOfMonth());
		System.out.println(ltd2.getDayOfYear());
		System.out.println(ltd2.getMonth());
		System.out.println(ltd2.getYear());
		System.out.println(ltd2.getHour());
		
		System.out.println(ltd2.get(ChronoField.DAY_OF_WEEK));
		System.out.println(ltd2.get(ChronoField.DAY_OF_MONTH));
		System.out.println();
		
		MonthDay day1 = MonthDay.of(1, 1);
		MonthDay day2 = MonthDay.of(1, 2);
		System.out.println(day1.isBefore(day2));
		System.out.println(day1.isAfter(day2));
		System.out.println();
		
		LocalDate d1 = LocalDate.of(2022, 3, 20);
		LocalDate d2 = d.withMonth(4).withYear(2023);
		System.out.println(d1);
		System.out.println(d2);
		
		LocalDate d3 = d1.plusDays(5).plusMonths(3).minusYears(2);
		System.out.println(d3);
		
		LocalDate d4 = d1.minus(4, ChronoUnit.YEARS);
		System.out.println(d4);
	}
}
