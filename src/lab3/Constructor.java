/*Write an Account class with default constructor, parameterised constructor and
methods toString(), deposit(int amt), withdraw(int amt). withdraw method
should take care of insufficient balance. Accept the values from the user..Display
the details of various Accounts*/
package lab3;

class Account
{
	int accountbalance=0;
	Account()
	{
		accountbalance=10000;
	}
	
	Account(int accountbalance)
	{
		this.accountbalance=accountbalance;
	}
	int deposit (int ammount) {
		
		accountbalance=accountbalance+ammount;
		return accountbalance;
	}
	
	int withdraw (int ammount) {
		
		accountbalance=accountbalance-ammount;
		return accountbalance;
	}

	@Override
	public String toString() {
		return "accountbalance=" + accountbalance + "";
	}
	
}

public class Constructor {

	public static void main(String[] args) 
	{
		Account amt1= new Account();
		
		amt1.deposit(0);
		amt1.withdraw(200);
		System.out.println(amt1);
		


	}

}
