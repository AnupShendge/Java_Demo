package Interface;

public class Developer implements BankingClient, DomainClient {
	// This class is responsible to implement all the methods of bankingclient

	@Override
	public void payCreditCard() {
		System.out.println("Pay credit card implemented");
		
	}

	@Override
	public void transferBalance() {
		System.out.println("Transfer Balance implemented");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Check Balance implemented");
		
	}
	
	@Override
	public void investement() {
	System.out.println("Investement is completed");
		
	}
	
	public void thankYou() {
		System.out.println("Thanks for watching");
	}
	
	public static void main(String[] args) {
	/*	Developer dp = new Developer(); // Created developer object to access only sub class methods
		dp.payCreditCard();
		dp.transferBalance();
		dp.checkBalance();
		dp.thankYou();*/
		

		
		BankingClient bc = new Developer(); // Upcasting
		bc.payCreditCard();
		bc.transferBalance();
		bc.checkBalance();
		// bc.thankYou(); Error because this method is present under developer 
		Developer dp = (Developer) bc; //Downcast to access subclass property
		dp.thankYou();
		
		DomainClient dc = new Developer();
		dc.investement();
		
		
		
	}

	

}
