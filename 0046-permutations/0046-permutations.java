class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        permutation(nums,0);
        return ans;


    }

    public void permutation(int arr[],int in){
        ArrayList<Integer> temp=new ArrayList<>();

        if(in==arr.length){

            for(int i=0;i<arr.length;i++){
                temp.add(arr[i]);        
            }
            ans.add(temp);
            return;
        }


        for(int i=in;i<arr.length;i++){
            swap(arr,in,i);

            permutation(arr,in+1);
            swap(arr,in,i);
        }

    }

    public void swap(int arr[],int idx, int curr){
        int temp=arr[curr];
        arr[curr]=arr[idx];
        arr[idx]=temp;
    }
}