class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int index = 0; index < nums.length; index++)
        {
            if(map.containsKey(target - nums[index]))

                return new int[]{index, map.get(target - nums[index])};
            
            if(!map.containsKey(nums[index]))

                map.put(nums[index], index);

        }
        
        return new int[2];
    }
}