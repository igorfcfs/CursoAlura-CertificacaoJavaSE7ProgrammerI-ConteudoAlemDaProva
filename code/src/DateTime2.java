import java.time.*;

public class DateTime2 {
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = ldt.toLocalDate();
		LocalTime lt = ldt.toLocalTime();
		
		LocalDateTime ldt2 = ld.atTime(lt);
		LocalDateTime ldt3 = lt.atDate(ld);
		
		System.out.println(ldt);
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt2);
		System.out.println(ldt3);
	}
}
