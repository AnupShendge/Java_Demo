package Abstraction;

public class Main extends Language {
	//Here, we have used the super() inside the constructor of Main to access the constructor of the Language.
	Main(String name) {
		super(name);
		System.out.println("Main class constructor");
	}
	
	public void display() {
		
		System.out.println("Java programming langauage");
	}
	
	

	public static void main(String[] args) {
		
		Language l = new Main("Anup") ;
		
		l.display();
		
		l.method1();
		
		

	}

}
