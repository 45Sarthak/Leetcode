class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        return helper(nums,goal)-helper(nums,goal-1);

    }

    public static int helper(int nums[],int goal){
    
    int sum=0;
    int low=0;
    int max=0;
    for(int high=0;high<nums.length;high++){
        if (goal < 0) return 0;
        sum+=nums[high];

        while(sum>goal){

            if(nums[low]==1){
                sum--;
            }

            low++;
        }     

        max+=(high-low+1);

    }

    return max;

    }


    
}