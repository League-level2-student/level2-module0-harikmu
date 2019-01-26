package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] element = {"1", "2","3", "4", "5"};
		//2. print the third element in the array
		System.out.println(element[2]);
		//3. set the third element to a different value
		element[2] = "three";
		//4. print the third element again
		System.out.println(element[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<element.length;i++) {
		     System.out.println(element[i]);
		}
		//6. make an array of 50 integers
		int[] element2 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<element2.length;i++) {
			Random rand = new Random();
			element2[i]= rand.nextInt(50) + 1;
		}
		//8. without printing the entire array, print only the smallest number in the array
        int smallest = 51;
		for (int i=0;i<element2.length;i++) {
        		if(element2[i] < smallest) {
        			smallest = element2[i];
        		}
        }
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int entire : element2) {
		     System.out.println(entire);
		}
		//10. print the largest number in the array.
		 int largest = 0;
	     for (int i=0;i<element2.length;i++) {
	        	if(element2[i] > largest) {
	        		largest = element2[i];
	        		}
	        }
			System.out.println(largest);
	}
}
