class Solution {
    public int[] searchRange(int[] nums, int target) {

        //Define useful vars
		int[] ans = {-1, -1};
		int low = 0;
        int high = nums.length - 1;

        //Check if array has values, if not return [-1,-1]
        if (nums.length == 0) {
            return ans;
        }

		while (nums[low] < nums[high]) {
			int mid = low + (high - low) / 2;

            //Check if target is in the left half
			if (nums[mid] > target) {
				high = mid - 1;
			} 
            //Check if target is in the right half
            else if (nums[mid] < target) {
				low = mid + 1;
			} 
            //Target, then need to find the lowest array index value and the highest index value
            else {
				if (nums[low] == nums[mid]) {
					high--;
				} else {
					low++;
				}
			}
		}

		//Check if target exists in the array, if it does, initialize our low and high index values to be returned, otherwise return [-1, -1]
		if (nums[low] == target) {
			ans[0] = low;
			ans[1] = high;
		}

		return ans;

	}
}