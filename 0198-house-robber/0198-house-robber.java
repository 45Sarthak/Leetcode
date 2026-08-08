class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);


        return solve(0,nums,dp);
    }


    public int solve(int i,int arr[],int dp[]){
        if(i>=arr.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int skip=solve(i+1,arr,dp);
        int take= arr[i]+solve(i+2,arr,dp);

        dp[i]=Math.max(skip,take);

        return dp[i];
    }
}