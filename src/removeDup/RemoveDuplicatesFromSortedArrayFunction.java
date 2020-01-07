package removeDup;

public class RemoveDuplicatesFromSortedArrayFunction {
    public int removeDuplicates(int[] nums) {
    	// Length of array
        int n = nums.length;
        
        // If only one element, without this it will give error
        if(n <= 1){
            return n;
        }
        
        // Just the length of the final array
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
}
