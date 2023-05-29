package may22.suppressedException.bankingApplication.models;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class User {
	
	private String userId = "USER_ID"+UUID.randomUUID().toString();
	private String userName;
	private String email;
	private LocalDate dateOfBirth;
	private String panCard;
	private Address currentAddress;
	private Address permanentAddress;
	private String aadharCard;
	private List<? extends Cards> cards;
}
