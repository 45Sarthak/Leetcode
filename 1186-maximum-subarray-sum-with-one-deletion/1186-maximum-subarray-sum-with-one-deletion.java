class Solution {
    public int maximumSum(int[] arr) {
        int preNotDel=arr[0];
        int prewithDel=0;
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            prewithDel=Math.max(preNotDel, prewithDel+arr[i]);
            preNotDel=Math.max(preNotDel+arr[i], arr[i]);

            int curr=Math.max(preNotDel,prewithDel);

            max=Math.max(max,curr);

        }

        return max;
    }
}