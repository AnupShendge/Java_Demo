package Arrays;

public class ReverseElement {

	public static void main(String[] args) {
			int ar[] = {2,4,5,7,9};
			System.out.println("Before reversing");
			dispArray(ar);
			for(int i = 0;i<ar.length/2;i++)
				{
				int temp=ar[i];
				ar[i]=ar[ar.length-1-i];
				ar[ar.length-1-i]=temp;
				}

			System.out.println("After reversing");
			dispArray(ar);


			}

			private static void dispArray(int[] ar)
			{
			for(int i =0;i<ar.length;i++)
			System.out.println(ar[i]);
			System.out.println();
			}


	}

