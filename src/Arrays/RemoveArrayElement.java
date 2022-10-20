package Arrays;

//Refer link : https://chercher.tech/java-questions/remove-element-array-java-questions
import java.util.Arrays;

public class RemoveArrayElement {

	public static void main(String[] args) {
		int[] oldArray = new int[] { 12, 54, 65, 89, 58 };

		int[] newArray = new int[oldArray.length - 1];

		int j = 2;

		for (int i = 0, k = 0; i < oldArray.length; i++) {

			if (i != j) {
				newArray[k] = oldArray[i]; // copying elements to new array
				k++;
			}
		}

		System.out.println("Old array :" + Arrays.toString(oldArray));
		System.out.println("Index position to be deleted = " + j);
		System.out.println("New array :" + Arrays.toString(newArray));

	}

}
