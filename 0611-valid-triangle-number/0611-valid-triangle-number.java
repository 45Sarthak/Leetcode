class Solution {
    public int triangleNumber(int[] nums) {

int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            // if(nums[i]==0){
            //     continue;
            // }

            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
               int k=binary(j+1,nums.length-1,nums,sum);

               if(k!=-1){
                    count+=(k-j);
               }
            }
        }

        return count;

    }


    public int binary(int low,int high, int arr[],int target){
        int res=-1;

        while(low <= high){
            int mid=low+(high-low)/2;

            if(arr[mid]<target){
                res=mid;
                low=mid+1;
            }

            else {
                high=mid-1;
            }

          
        }
        return res;
    }
}