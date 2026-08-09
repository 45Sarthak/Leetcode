class Solution {

    public int[] searchRange(int[] nums, int target) {


        int firstvar=first(nums, target);
        int lastvar=last(nums, target);

        int res[]={firstvar,lastvar};
        return res;
}




public int first(int[] nums, int target){

    int mid=0;
    int high=nums.length-1;
    int low=0;
    int result=-1;   

    while(low<=high){

        mid=(low+high)/2;
 
        if(nums[mid]<target){
            low=mid+1;
        }

        else if(nums[mid]>target ){
            high=mid-1;
        }

        else{
            result=mid;
            high=mid-1;
        }
    }

    return result;

}

public int last(int[] nums, int target){
    
    int mid=0;
    int high=nums.length-1;
    int low=0;
    int result=-1;  
    while(low<=high){
        mid=(low+high)/2;
        
        if(nums[mid]<target){
            low=mid+1;
            
        }

        else if(nums[mid]>target ){
            high=mid-1;
        }

        else{
            result=mid;
            low=mid+1;
        }
    }

    return result;

}
}


    
