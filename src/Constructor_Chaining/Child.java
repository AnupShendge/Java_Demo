package Constructor_Chaining;

public class Child extends Parent {

	public Child() // Constructor3
	{
		this("JIP"); // It calls the current class Constructor ie : Constructor4
		System.out.println("Child class no-args constructor called");
	}

	public Child(String name) // Constructor4
	{
		super("JIP"); // It calls the super class Constructor ie : Constructor2
		System.out.println("Child class Parameterized constructor called by " + name);
	}

	public static void main(String args[]) {
		Child c = new Child();

	}

}
