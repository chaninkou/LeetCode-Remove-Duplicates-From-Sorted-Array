package removeDup;

public class RemoveDuplicatesFromSortedArrayFunction {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        if(n < 2){
            return n;
        }
        
        // Just the length of the final array
        int id = 1;
        
        for(int i = 1; i < n; i++){
            // Just compare two elements using current index to the previous index
            if(nums[i] != nums[i-1]){
                nums[id] = nums[i];
                id++;
            }
        }
        
        return id;
    }
}
