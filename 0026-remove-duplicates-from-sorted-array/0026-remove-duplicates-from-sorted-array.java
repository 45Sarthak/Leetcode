class Solution {
    public int removeDuplicates(int[] nums) {
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[counter]!=nums[i]){
                counter++;
                nums[counter]=nums[i];
        }
        }
        return counter+1;
    }
}