package methodOverriding;

public class SBM extends HDFC {
	
	public void homeLoanROI() {
		// super.homeLoanROI();
		System.out.println("rate of interest for home loan is 5%");
	}
	
public static void main(String[] args) {
		
		SBM obj = new SBM();
		
		obj.homeLoanROI();
		

	}

}
