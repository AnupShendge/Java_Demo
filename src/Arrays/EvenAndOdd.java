package Arrays;

public class EvenAndOdd {
	public static void main(String[] args) 
	{
		int ce=0,co=0;
		int ar[] = {7, 4, 5, 6, 3, 1 } ; 
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i] + " is an even number");
				ce++;
			}

			else
			{
				System.out.println(ar[i] + " is an odd number");
				co++;
			}
		}
		System.out.println("Number of even numbers: " + ce + "\nNumber of odd numbers: " + co);
	}
}
