class Solution {
    public int longestOnes(int[] arr, int k) {
        int low=0;
        int count=0;
        int max=0;
        
        for(int high=0;high<arr.length;high++){
            if(arr[high]==0){
                count++;
            }

            while(count > k){
                
                if(arr[low]==0){
                    count--;
                }
                low++;
            }

            max=Math.max(max,high-low+1);
        }

        return max;
    }
}