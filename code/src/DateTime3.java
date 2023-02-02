import java.time.*;
import java.util.*;

public class DateTime3 {
	public static void main(String[] args) {
		Date d = new Date();
		Instant i = d.toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		Calendar c = Calendar.getInstance();
		Instant i1 = c.toInstant();
		LocalDateTime ldt2 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		Instant i2 = ldt.toInstant(ZoneOffset.UTC);
		Date d2 = Date.from(i2);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
	}
}
