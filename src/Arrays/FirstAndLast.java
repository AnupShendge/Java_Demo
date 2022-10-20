package Arrays;
//Java program to find first and last occurrence of
//an elements in given sorted array

public class FirstAndLast {
	public static void findFirstAndLast(int arr[], int x)
    {
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue; // continues the forloop
            if (first == -1)
                first = i; // 1
            last = i; // 3
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 2 };
        int x = 2;
        findFirstAndLast(arr, x);
    }

}
