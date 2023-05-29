package may22.suppressedException.bankingApplication.models;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Transaction {
	private String transactionalId = "Transact_ID"+UUID.randomUUID().toString();
	private TransactionalType transactionalType;
	private String fromBankingAccountId;
	private String toBankingAccountId;
	private String fromBankingName;
	private String toBankingName;
	private long transactionalAmount;
	private long availableAmount;
	private ZonedDateTime transactionTimeDetails;
	
	
	
	
	
	
	
	
	
	public Transaction(String transactionalId, TransactionalType transactionalType, String fromBankingAccountId,
			String toBankingAccountId, String fromBankingName, String toBankingName, long transactionalAmount,
			long availableAmount, ZonedDateTime transactionTimeDetails) {
		super();
		this.transactionalId = transactionalId;
		this.transactionalType = transactionalType;
		this.fromBankingAccountId = fromBankingAccountId;
		this.toBankingAccountId = toBankingAccountId;
		this.fromBankingName = fromBankingName;
		this.toBankingName = toBankingName;
		this.transactionalAmount = transactionalAmount;
		this.availableAmount = availableAmount;
		this.transactionTimeDetails = transactionTimeDetails;
	}
	
	
	public String getTransactionalId() {
		return transactionalId;
	}
	public TransactionalType getTransactionalType() {
		return transactionalType;
	}
	public String getFromBankingAccountId() {
		return fromBankingAccountId;
	}
	public String getToBankingAccountId() {
		return toBankingAccountId;
	}
	public String getFromBankingName() {
		return fromBankingName;
	}
	public String getToBankingName() {
		return toBankingName;
	}
	public long getTransactionalAmount() {
		return transactionalAmount;
	}
	public long getAvailableAmount() {
		return availableAmount;
	}
	public ZonedDateTime getTransactionTimeDetails() {
		return transactionTimeDetails;
	}
	
	
	
	
}
