class Solution {
    public int singleNumber(int[] nums) {

        int len = nums.length;
        Arrays.sort(nums);

         if (len == 1) {
            return nums[0];
        }
        Stack<Integer> numStack = new Stack<>();
        for (int i=0; i < len; i++) {
           if (numStack.isEmpty()) {
               numStack.push(nums[i]);
           } else if (numStack.peek() == nums[i]) {
               numStack.pop();
           } else {
               break;
           }
        }
        return numStack.peek();
    }
}