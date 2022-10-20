package Strings;

public class CountCharacter {

	public static void main(String[] args) {
	
		String st = "my name is anup";
		
		char ch = 'a';
		
		int Count = 0;
		
		for(int i=0; i<st.length(); i++) {
			
			if(st.charAt(i)==ch) {
				Count++;
				
			}
		}
		System.out.println("The character '" + ch + "' found " + Count + " times in a string '" + st + "'.");

	}
		
}
	
