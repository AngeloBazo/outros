package internet;

import java.util.Arrays;

public class Array_24_01_23 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		for (int element : array) {

			System.out.print(element + ", ");
		}

		System.out.println("");
		System.out.println("--------------------------------------");
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("--------------------------------------");
	
		int [][] array2 = {{1,2}, {3,4}, {5,6,7}};
	
		System.out.println(Arrays.deepToString(array2));
		
	}

}
