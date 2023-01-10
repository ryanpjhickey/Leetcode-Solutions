//this solution's runtime is not optimal. I wanted to practice using stacks which is why I came up with this solution!


class Solution2 {
    public int removeDuplicates(int[] nums) {

       Stack<Integer> myStack = new Stack<>();
       int length = nums.length;
       int result = 0;
        
        for(int i = length-1 ; i >= 0; i--){
            if(!myStack.contains(nums[i])){
                myStack.push(nums[i]);
            }
        }
		
        for(int j = 0; j < length; j++){
            if(!myStack.isEmpty()){
                nums[j]=myStack.pop();
                result++;
            }
         
        }
        return result;
    }
}