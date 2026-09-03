class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        // Find first position from left where order breaks
        while(low < nums.length - 1 &&
              nums[low] <= nums[low + 1]) {
            low++;
        }

        // Already sorted
        if(low == nums.length - 1) {
            return 0;
        }

        // Find first position from right where order breaks
        while(high > 0 &&
              nums[high] >= nums[high - 1]) {
            high--;
        }

        // Find min and max inside unsorted part
        int min = nums[low];
        int max = nums[low];

        for(int i = low; i <= high; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Expand left
        while(low > 0 && nums[low - 1] > min) {
            low--;
        }

        // Expand right
        while(high < nums.length - 1 && nums[high + 1] < max) {
            high++;
        }

        return high - low + 1;
    }
}