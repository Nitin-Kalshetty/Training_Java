package may19.utcDate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class UtcDate {

	public static void main(String[] args) {
		System.out.println( OffsetDateTime.now(ZoneOffset.UTC));

	}

}
