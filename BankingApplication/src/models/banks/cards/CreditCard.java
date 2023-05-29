package models.banks.cards;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class CreditCard extends Cards{
	private Integer creditCardNo;
	private CardName cardName;
	private ExpiryMonth expiryMonth;
	private Integer expiryYear;
	private Integer cvv = new Random().nextInt(100, 1000);
	private String pin;
	private Integer limitAmount;
	private Integer spentAmount;
	private Integer availableAmount;
	private boolean defaulter = false;
	private List<Transaction> transactions;
	private Integer billedAmount;
	private Integer unbilledAmount;
	private LocalDate billingDate;
	private LocalDate dueDate;
	private Long rewardsPoints;
}
 