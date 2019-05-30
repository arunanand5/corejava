package Encapsulation;

public class Account {
    private int accno;
    private int account_balance;
    
	public int getAccount_number() {
		return accno;
	}
	public void setAccount_number(int accno) {
		System.out.println("Account number:"+ accno);
		this.accno = accno;
	}
	public int getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(int account_balance) {
		System.out.println("Account Balance"+ account_balance);
		this.account_balance = account_balance;
	}
	
    public static void main(String[] args) {
		Account s = new Account();
		s.setAccount_number(126);
		s.setAccount_balance(100);
	}
    

}
