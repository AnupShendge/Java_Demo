package Exception_Handling;

// By executing this below program we got a Airthematic Exception 

// This Airthematic Exception is handled in a "Calculator.java" program

public class Demo {
	
	
	public void Divide(int a, int b) {
		
		int c = a/b; 
	}
	
	public void Display() {
		System.out.println("Display method is printed because exception is caught in catch block");
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		d.Divide(3, 0);
		
		d.Display(); //Due to exception occur in above step so this line wont be executed
		
		
		
		
	}

}
