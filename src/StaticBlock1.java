
// How can we create objects if we make the constructor as private ?
// IF we make the constructor as private we cant access from out side of that class
// OutSide class name is "TestingStaticBlock1.java"
public class StaticBlock1 {
	
	int age ;
	
	public static int creatObject() {
		
		StaticBlock1 sbc = new StaticBlock1();
		sbc.age = 40;
		
		return sbc.age;
	}
	
	private StaticBlock1() {
		
		age = 30;
	}
	
	

}
