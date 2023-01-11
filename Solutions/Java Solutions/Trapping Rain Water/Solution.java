class Solution {
    public int trap(int[] height) {
        
        int leftMax = 0; //create our useful vars
        int trap = 0;
        int rightMax = 0;
        int leftArr[] = new int[height.length]; //leftArr finds maximum amount on the left of any given location
        int rightArr[] = new int[height.length]; //rightArr finds maximum amount on the left of any given location


        for(int index = 0; index < height.length; index++) { //loop from left to right
            if(leftMax < height[index]) { //find maximum of the left
                leftMax = height[index];
            }
            leftArr[index] = leftMax;
        }

        for(int index = height.length-1; index >= 0; index--) { //loop from right to left
            if(rightMax < height[index]) { //find maximum of the right
                rightMax = height[index];
            }
            rightArr[index] = rightMax;
        }

        for(int index = 0; index  < height.length; index++) { // loops through our previous arrays, caculates, and returns the amount of water trapped
            trap += Math.min(leftArr[index], rightArr[index]) - height[index];
        }
        return trap; //return the amount of trapped water
    }
}