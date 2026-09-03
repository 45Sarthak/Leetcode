class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low=0;
        int sum=1;
        int count=0;
        if(k<=1) return 0;

        for(int high=0;high<nums.length;high++){
            sum*=nums[high];
            
            
            // if(sum<=k){
            //     count++;
            // }

            while(sum >= k){
                sum/=nums[low];
                low++;
            }

            count+=(high-low+1);

            
        }

        return count;
    }

}