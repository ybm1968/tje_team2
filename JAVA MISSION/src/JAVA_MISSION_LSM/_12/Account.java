package JAVA_MISSION_LSM._12;

public class Account {
	private String accountNumber;		// 계좌번호
	private String accountHolder;		// 예금주
	private int balance;				// 예금잔액
	private String password;			// 비밀번호
	final int MIN_BALANCE = 0;			
	final int MAX_BALANCE = 1000000000;
	final int MIN_TRANSFER = 0;
	final int MAX_TRANSFER = 1000000;
	
	public Account() {
		this("계좌없음", "이름없음", 0);
	}
	
	public Account(String accountNumber, String accountHolder, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(int balance) {			// 입금
		this.balance += balance;			
	}
	
	public void withdrawal(int money) {			// 출금
		this.balance -= money;
		
	}
	
	// getter, setter
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance
				+ ", password=" + password + ", MIN_BALANCE=" + MIN_BALANCE + ", MAX_BALANCE=" + MAX_BALANCE
				+ ", MIN_TRANSFER=" + MIN_TRANSFER + ", MAX_TRANSFER=" + MAX_TRANSFER + "]";
	}
	
	
}
