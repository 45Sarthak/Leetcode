class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]=new int [nums.length];
        int neg[]=new int [nums.length];
        int n=0;
        int p=0;
       for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                neg[n++]=nums[i];
            }
       }


       for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                pos[p++]=nums[i];
            }
       }

    int res[]=new int[nums.length];

    for(int i=0;i<nums.length/2;i++){
        res[2*i]=pos[i];
        res[2*i+1]=neg[i];
    }

    return res;

    }
}