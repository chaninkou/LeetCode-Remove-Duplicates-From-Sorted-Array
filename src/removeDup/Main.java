package removeDup;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Since this problem only return the length of the array, pretty useless
		int[] nums = {1,1,1,2,2,3,4,5,5};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		RemoveDuplicatesFromSortedArrayFunction solution = new RemoveDuplicatesFromSortedArrayFunction();
		
		int[] answer = Arrays.copyOf(nums, solution.removeDuplicates(nums));
		
		System.out.println("Solution Array: " + Arrays.toString(answer));
	}
}
