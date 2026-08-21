import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean dupli=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                dupli=true;
            }
        }
        return dupli;
    }
}