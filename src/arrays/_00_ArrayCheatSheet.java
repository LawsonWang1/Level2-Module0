package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] set = { "hello", "hi", "bye", "goodbye", "see you later" };

		// 2. print the third element in the array
		System.out.println(set[3]);
		// 3. set the third element to a different value
		set[3] = "whats up";
		// 4. print the third element again
		System.out.println(set[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int x = 0; x < set.length; x++) {
			System.out.println(set[x]);
		}

		// 6. make an array of 50 integers
		int[] set2 = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random num = new Random();
		int y;
		for (y = 0; y < set2.length; y++) {
			set2[y] = num.nextInt(50);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int a = set2[0];
		for (y = 0; y < set2.length; y++) {
			if (a > set2[y]) {
				a = set2[y];
			}
		}
		System.out.println(a);

		// 9 print the entire array to see if step 8 was correct
		for (a = 0; a < set2.length; a++) {
			System.out.print(set2[a] + ", ");
		}
		// 10. print the largest number in the array.
		a = set2[0];
		for (y = 0; y < set2.length; y++) {
			if (a < set2[y]) {
				a = set2[y];
			}
		}
		System.out.println("");
		System.out.println(a);
	}
}
