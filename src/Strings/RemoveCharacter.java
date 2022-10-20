package Strings;

public class RemoveCharacter {
	
	/*public static void main(String[] args) {
		String str = "Anup Shendge";  
        System.out.println(charRemoveAt(str, 1));  
     }  
     public static String charRemoveAt(String str, int n) {  
        return str.substring(0, n) + str.substring(n + 4 );  
     }  
	}*/
	
	public static void main(String args[]) {
	      String str = "anup shendge";
	      System.out.println(removeCharAt(str, 2));
	   }
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1); //Aup Shendge
	   }
	}


