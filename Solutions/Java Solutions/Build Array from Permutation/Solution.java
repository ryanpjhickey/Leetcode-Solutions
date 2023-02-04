class Solution {
    public int[] buildArray(int[] nums) {

        int length = nums.length;
        
        for(int index=0; index < length; index++){
            nums[index] = nums[index] + length*(nums[nums[index]] % length);
        }
        
        for(int index=0; index < length; index++){
            nums[index] = nums[index] / length;
        }
        
        return nums;
    }
}