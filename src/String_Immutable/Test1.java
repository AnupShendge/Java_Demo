package String_Immutable;

public class Test1 {

	public static void main(String[] args) {
		
		// StringBuffer is mutable object
		StringBuffer sb = new StringBuffer("Java");
		
		sb.append("Selenium");
		
		System.out.println(sb); // It prints JavaSelenium
		
		
		// String object are immutable
		String s = new String("Java");
		
		s.concat("Selenium");
		
		System.out.println(s); // It prints only Java

	}

}
