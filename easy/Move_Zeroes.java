class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        int second = 0;
        
        while(second < nums.length) {
            if(nums[second] != 0) {
                nums[first] = nums[second];
                first++;
            }
            
            second++;
        }
        
        while(first < nums.length) {
            nums[first] = 0;
            
            first++;
        }
    }
}