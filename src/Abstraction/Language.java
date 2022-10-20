package Abstraction;
//An abstract class can have constructors like the regular class.
//And, we can access the constructor of an abstract class from the subclass using the super keyword.
public abstract class Language {
	
	String name ;
	
	// Regular method or concrete method
	public void method1() {
		
		System.out.println("Am in a method1");
	}
	
	//abstract method
	abstract void  display();
	
	// 
	Language(String name)  {
		
		System.out.println("Language constructor is called");
		
		this.name =name;
		
		System.out.println("Name is " + name);
		
		
		
	}

}
