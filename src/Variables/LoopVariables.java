package Variables;
// A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.
public class LoopVariables {

	public static void main(String[] args) {
		 {
	            // The variable x has scope within
	            // brackets
	            int x = 10;
	            System.out.println(x);
	        }
	         
	        // Uncommenting below line would produce
	        // error since variable x is out of scope.
	 
	        // System.out.println(x);
	    }

	}

