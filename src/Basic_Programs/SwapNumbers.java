
//*****Java Program to Swap two numbers without using third variable******/////


package Basic_Programs;
import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		
		int a, b;
		    

		System.out.println("Enter value in a:");
		a= s.nextInt();
		System.out.println("Enter value in b:");
		b= s.nextInt(); 
		System.out.println("Before swapping values are "+ "a="+ a + " b=" +b);
		
		//Logic 1- without using third variable
		a= a+b;    
		b = a-b;   
		a=a-b;      
		
		System.out.println("After swapping values are "+ "a="+ a + " b=" +b);
		
		//Logic 2 - With using third variable
		int x,y, z;
		System.out.println("Enter value in x:");
		x= s.nextInt();
		System.out.println("Enter value in y:");
		y= s.nextInt();
		System.out.println("Before swapping values are "+ "x="+ x + " y=" +y);
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("After swapping values are "+ "x="+ x + " y=" +y);
		
		//Logic 3 - Without using third variable
				int m,n;
				System.out.println("Enter value in m:");
				m= s.nextInt();
				System.out.println("Enter value in n:");
				n= s.nextInt();
				System.out.println("Before swapping values are "+ "m="+ m + " n=" +n);
				
				m=m*n;
				n=m/n;
				m=m/n;
				
				System.out.println("After swapping values are "+ "m="+ m + " n=" +n);
				
				//Logic 4 -Uisng single statement
				int p,q;
				System.out.println("Enter value in p:");
				p= s.nextInt();
				System.out.println("Enter value in q:");
				q= s.nextInt();
				System.out.println("Before swapping values are "+ "p="+ p + " q=" +q);
				
				q=p+q-(p=q);
				
				System.out.println("After swapping values are "+ "p="+ p + " p=" +q);
		
	}

}
