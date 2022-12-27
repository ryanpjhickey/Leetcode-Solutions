class Solution {
    public int trap(int[] height) {
        
        int leftMax = 0;

        //leftArr finds maximum amount on the left of any given location

        int leftArr[] = new int[height.length];

        // loop from left to right

        for(int index = 0; index < height.length; index++) {
            // find maximum of the left
            if(leftMax < height[index]) {
                leftMax = height[index];
            }
            leftArr[index] = leftMax;
        }
        
        int rightMax = 0;
        
        //rightArr finds maximum amount on the right of any given location

        int rightArr[] = new int[height.length];
        // loop from right to left
        for(int index = height.length-1; index >= 0; index--) {
            
            // find maximum of the right

            if(rightMax < height[index]) {
                rightMax = height[index];
            }
            rightArr[index] = rightMax;
        }
        
        int trap = 0;
        // loops through our previous arrays, caculates, and returns the amount of water trapped
        for(int index = 0; index  < height.length; index++) {
            trap += Math.min(leftArr[index], rightArr[index]) - height[index];
        }
        return trap;
    }
}