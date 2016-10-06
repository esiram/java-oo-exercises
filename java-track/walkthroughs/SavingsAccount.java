
public class SavingsAccount {
	
	private Integer balance;
	private double interest_rate;
	
	//first write the constructor - how this thing comes to be
	// it takes arguements and is public so you can access it
	public SavingsAccount(Integer balance, double interest_rate) {
		this.balance = balance;
		this.interest_rate = interest_rate;
	}
	
	//we need getters and setters
	//how do we get the balance?
	public Integer getBalance() { 
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interest_rate;
	}
	
	//do you want it to return something? An implementation question (void if not); we want it to store the balance too
	public Integer add(Integer amount) {
		this.balance += amount; 
		return this.balance;
	}
	
	public Integer remove(Integer amount) {
		this.balance -= amount;
		return this.balance;
	}

	
	//balance is an integer and interest rate is a double will this work as a multiplication problem? you will get a double, but I want to add that to my balance. can I add a double to my integer?
	public Integer accrue() {
		return (this.balance += (int) (this.balance * this.interest_rate));  //this casts it into an integer.....
	}
	
	public String toString() {
		return ("Balance: " + this.balance + " Interest Rate: " + this.interest_rate);
	}
	
	public void merge(SavingsAccount other) {  //for the sake of argument: merge another account object to another account object
		this.balance += other.getBalance();
		other.remove(other.getBalance());
	}
	
	public static void main(String[] args) {
		SavingsAccount my_account = new SavingsAccount(100, 0.5);  //both the type and the substantiator (args: balance and interest rate)
		
				System.out.println(my_account.getBalance());
				System.out.println(my_account.add(10));
				System.out.println(my_account.accrue());
				System.out.println(my_account);
	}

}
