class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        int count = 0;

        for (int high = 0; high < nums.length; high++) {

            // right element add
            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);

            // distinct k se zyada ho gaya
            while (map.size() > k) {

                int left = nums[low];

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                low++;
            }

            // current window ke saare subarrays valid
            count += high - low + 1;
        }

        return count;
    }
}