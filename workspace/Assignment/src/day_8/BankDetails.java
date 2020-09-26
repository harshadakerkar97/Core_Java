//Create a program that helps banks to maintain records.
//It should have following facilities. o Anybody can create 
//current or saving account with following initial information: 
//account number, name, balance, and branch. o display account detail 
//for a particular accounts. o display total money deposited in bank. 
//o allow deposit and  withdrawal in an account  .
//o for saving account opening balance and minimum balance must be 5000.
//o for current account opening balance and minimum balance must be 1000. 
//o can not withdraw the amount from the account that makes balance less than the minimum balance. 
package day_8;
class Bank{
	private String name;
	private int acc_no;
	private double balance;
	private String branch;
	private String atype;
	public Bank() {
		
	}
	public Bank(String name, int acc_no, double balance, String branch, String atype) {
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
		this.branch = branch;
		this.atype = atype;
	}
	void deposite(double p) {
		balance+=p;
		System.out.println("Amount deposited successfully!!!!!");
	}
	void withdraw(double p) {
		if(atype.equals("saving")) {
			if(balance>p && (balance-p)>5000) {
				balance-=p;
				System.out.println("Amount withdraw sucessfully!!!");
			}else {
				System.out.println("Insuffient balance!!!!");
			}
		}else if(atype.equals("current")) {
			if(balance>p && (balance-p)>1000) {
				balance-=p;
				System.out.println("Amount withdraw sucessfully!!!");
			}else {
				System.out.println("Insuffient balance!!!!");
			}
		}
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", acc_no=" + acc_no + ", balance=" + balance +
				", branch=" + branch + ", atype="
				+ atype + "]";
	}
	
	
	
}

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank("harshada",6549,8000,"kharegaon","current");
		System.out.println(b);
		b.deposite(500);
		System.out.println(b);
		b.withdraw(500);
		System.out.println(b);
		b.withdraw(7000);
		System.out.println(b);
		
	}

}
