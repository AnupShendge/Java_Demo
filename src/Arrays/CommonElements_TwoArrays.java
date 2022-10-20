package Arrays;

public class CommonElements_TwoArrays {
	//compare two arrays and display the common elements
	public static void main(String[] args)
		{
			int[] a = {10, 20, 25, 48, 98};
			int[] b = {20, 34, 24, 10, 19};
			intersection(a,b);
			
		}

		private static void intersection(int[] a, int[] b) {
		{
			for(int i =0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==b[j])
						System.out.println(b[j]);
				}
			}
			
		}

	}

	
		
	}

