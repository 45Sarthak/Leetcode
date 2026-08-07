class Solution {
    public int minSubArrayLen(int k, int[] arr) {
     int sum=0;
       int low=0;
       int min=Integer.MAX_VALUE;

       for(int high=0;high<arr.length; high++){
        sum+=arr[high];


        while(sum>=k){
            
            min=Math.min(min,high-low+1);

            sum-=arr[low];
            low++;

        }


       }

        if(min==Integer.MAX_VALUE) return 0;
       return min;

    }
}




      