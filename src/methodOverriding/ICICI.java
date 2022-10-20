package methodOverriding;

public class ICICI extends HDFC {
	
public void homeLoanROI() {
		
		System.out.println("rate of interest for home loan is 25%");
	}

	public static void main(String[] args) {
		HDFC hd = new HDFC();
		hd.homeLoanROI();

	}

}
