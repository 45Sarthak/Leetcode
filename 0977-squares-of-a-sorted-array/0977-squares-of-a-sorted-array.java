class Solution {
    public int[] sortedSquares(int[] arr) {
       int low=0;
       int high=arr.length-1;
       int result[]=new int[arr.length];
       int index=arr.length-1;

       while(low<=high){
        if(Math.abs(arr[low])> Math.abs(arr[high])){
            result[index]=arr[low]*arr[low];
            low++;
        }

        else{
            result[index]=arr[high] * arr[high];
            high--;
        }

        index--;
       }

       return result;
    }

   
}