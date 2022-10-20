package String_Immutable;
//In case of String equals method is always meant for content comparison
// but in case of StringBuffer equals method is always meant for reference comaprison
public class Test2 {

	public static void main(String[] args) {
		
		
		String s1 = new String("Jenkins") ;
		
		String s2 = new String("Jenkins") ; // New objects is got created in the heap area even though the contents are same
		
		System.out.println(s1 == s2);  // F
		
		System.out.println(s1.equals(s2)); // T
		
		
		StringBuffer sb1 = new StringBuffer("Jenkins") ;
		
		StringBuffer sb2 = new StringBuffer("Jenkins") ;
		
		System.out.println(sb1 == sb2); // F
		
		System.out.println(sb1.equals(sb2)); // F
	}

}
