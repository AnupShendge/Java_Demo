package methodOverriding1;

public class Device {

	public static void main(String[] args) {
		
		
		Andriod an = new iOS() ;
		
		
		
		
		
		String st = an.Playstore() ;
		
		System.out.println(st);
		
		
		
		int a = an.MobilePrice() ;  // static method acannot be overriden in java
		
		System.out.println(a);

	}

}
