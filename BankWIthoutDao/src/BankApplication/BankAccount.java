package BankApplication;

public class BankAccount {

	String accountNumber = "123456789";
	float balance = 100.0f;
	String customerName = "Mina";
	String email = "jhakfj@gmail.com";
	String phoneNumber = "317469991";
	
	BankAccount(){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
		
	}
	
	public void deposite(float n) {
		this.balance += n;
		setBalance(this.balance);
		System.out.println("The Amount of " + "n" + "has deposit into you account.");
		
	}
	
	public void withdraw(float n) {
		if(n > this.balance) {
			System.out.println("Balance insufficient");
		}
		else {
			this.balance -= n;
			setBalance(this.balance);
			System.out.println("The Amount of " + "n" + "has withdraw from you account.");
		}
		
		
	}

	public String getAccountNumber() {
		System.out.println(this.accountNumber);
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		
		this.accountNumber = accountNumber;
		System.out.println("AccountNumber changed to " + accountNumber);
	}

	public float getBalance() {
		System.out.println(this.balance);
		return balance;
	}

	public void setBalance(float balance) {
		System.out.println("Blance updated to " + balance);
		this.balance = balance;
	}

	public String getCustomerName() {
		System.out.println(this.customerName);
		return customerName;
	}

	public void setCustomerName(String customerName) {
		System.out.println("Customer Number updated to " + accountNumber);
		this.customerName = customerName;
	}

	public String getEmail() {
		System.out.println(this.email);
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Email updated to " + email);
		this.email = email;
	}

	public String getPhoneNumber() {
		System.out.println(this.phoneNumber);
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		System.out.println("Phone NUmber updated to " + phoneNumber);
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}
