package leetcode26;

public class RemoveDuplicatesFromSortedArrayFunction {
    public int removeDuplicates(int[] nums) {
    	// Length of array
        int n = nums.length;
        
        // If only one element, without this it will give error
        if(n <= 1){
            return n;
        }
        
        // Just the length of the final array
        // Starting from 1 to prevent overflow
        int currentTotalLength = 1;
        
        for(int i = 1; i < n; i++){
            // Just compare two elements using current index to the previous index
            if(nums[i] != nums[i-1]){
                nums[currentTotalLength] = nums[i];
                currentTotalLength++;
            }
        }
        
        return currentTotalLength;
    }
    
    public int removeDuplicates1(int[] nums) {
        int position = 0;
        
        for(int n : nums){
        	// Since only one duplicate or not position - 1 will make sure the previous duplicate is not the same
            if(position < 1 || n > nums[position - 1]){
                nums[position] = n;
                position++;
            }
        }
        
        return position;
    }
}
