package wed17th.bankingTasks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClayFin {

	private final String accountId = "CLAY_FIN"+UUID.randomUUID().toString();
	private String name;
	private String address;
	private TYPE type;
	public String getAccountId() {
		return accountId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public TYPE getType() {
		return type;
	}

	public String get_IFSC() {
		return _IFSC;
	}

	public long getBalance() {
		return balance;
	}

	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public String getBranch() {
		return branch;
	}

	public Integer getPincode() {
		return pincode;
	}

	public LocalDateTime getAccountCreation() {
		return accountCreation;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	private final String _IFSC = "CLAY1111";
	private long balance;
	private final List<Transaction> transactionHistory = new ArrayList<>();
	private final String branch = "SRP Stratford OMR Chennai Tamil Nadu";
	private final Integer pincode  = 6000041;
	private LocalDateTime accountCreation;
	private String mobileNumber;
	private String password;
	@Override
	public String toString() {
		return "ClayFin [accountId=" + accountId + ", name=" + name + ", address=" + address + ", type=" + type
				+ ", _IFSC=" + _IFSC + ", balance=" + balance + ", transactionHistory=" + transactionHistory
				+ ", branch=" + branch + ", pincode=" + pincode + ", accountCreation=" + accountCreation
				+ ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}
	
	public ClayFin(String name, String address, TYPE type, long balance, LocalDateTime accountCreation,
			String mobileNumber, String password) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;
		this.balance = balance;
		this.accountCreation = accountCreation;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	
	
	
	
}
