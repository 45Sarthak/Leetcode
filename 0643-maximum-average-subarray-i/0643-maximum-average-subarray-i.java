class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        double max=(double)sum/k;

        int low=0;
        int high=k;
        while(high<arr.length){
            sum-=arr[low];
            sum+=arr[high];

            double avg=(double)sum/k;

            max=Math.max(max,avg);

            low++;
            high++;
        }

    return max;
    }

}