class Solution {

    public int minEatingSpeed(int[] piles, int h) {


    int low=1;
    int high=max(piles);
    int mid=0;
    int res=-1;
    while(low<=high){
        mid=low+(high-low)/2;
        long hours=findHours(piles,mid);
        if(hours > h){
            low=mid+1;
        }

        else{
            res=mid;
            high=mid-1;
        }
    }

    return res;

    }



        //helper function        
        public long findHours(int arr[],int speed){
            long h=0;
            for(int i=0;i<arr.length;i++){
                h+=arr[i]/speed;
                if(arr[i]%speed!=0){
                    h++;
                }
            }
            return h;
        }


    // finding Max value
        public int max(int arr[]){
            int high=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>high){
                    high=arr[i];
                }
            }

            return high;
        }




    
}