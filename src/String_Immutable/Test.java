package String_Immutable;

public class Test {

	/*public static void main(String[] args) {
	
		String s = "Anup" ;
		
		s.concat("Shendge") ;  //concat() method appends the string at the end
		
		System.out.println(s); //will print "Anup" because strings are immutable objects 

	}
	*/
// Method 2	
	
/*	public static void main(String[] args) {
		
		String s = "Anup"  ;
		
		s = s.concat("Shendge"); // if we explicitely assign it to the reference variable, it will refer to "Anup Shendge" object
		
		System.out.println(s); 
	}*/
	
	/*	public static void main(String[] args) {
	
	String s1 = "Anup"  ;
	
	String s2 = "Anup"  ;
	
	System.out.println(s1 == s2); // True
	
	s1 = s2 + "Shendge" ;
	
	System.out.println(s1 == s2); // False
}*/
	
	public static void main(String[] args) {
	String s1 ="anup" ;
	
	String s2 = s1.toString();
	
	//String s2 = new String("anup");
	
	String s3 = s1.toLowerCase();
	
	String s4 = s1.toUpperCase();
	
	System.out.println(s1 == s2);  // True
	
	System.out.println(s1 == s3); // True
	
	System.out.println(s1 == s4); // False
	
	}


}
