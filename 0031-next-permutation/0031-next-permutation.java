class Solution {

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int blue = -1;

        // Step 1: Find pivot
        for (int i = n - 1; i > 0; i--) {

            if (nums[i - 1] < nums[i]) {
                blue = i - 1;
                break;
            }
        }

        // Step 2: Find element just greater than nums[blue]
        if (blue != -1) {

            int swap_idx = -1;

            for (int i = n - 1; i > blue; i--) {

                if (nums[i] > nums[blue]) {
                    swap_idx = i;
                    break;
                }
            }

            // Step 3: Swap
            swap(nums, blue, swap_idx);
        }

        // Step 4: Reverse suffix
        reverse(nums, blue + 1, n - 1);
    }
}