package UpCasting;

public class Test {

	public static void main(String[] args) {
             Vehicle v = new Bike(); //UpCasting
             v.start();
             v.start1();
           //v.start2();  
             Bike b = (Bike) v; //DownCasting
             b.start2();
		
		/*Vehicle v = new Vehicle() ;
		
		v.start();*/
		
		/*Bike b = new Bike() ;
		
		b.start();
		
		b.start1();
		
		b.start2();*/
		
	}

}
