class Solution {

    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        unique(nums,0);
        return ans;
    }

    public void unique(int arr[],int idx){
        
        ArrayList<Integer> temp=new ArrayList<>();
        if(idx==arr.length){

            for(int i=0;i<arr.length;i++){
                temp.add(arr[i]);
            }
            ans.add(temp);
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=idx;i<arr.length;i++){
            if (set.contains(arr[i])) {
                continue;
            }

            set.add(arr[i]);

            swap(arr,i,idx);

            unique(arr,idx+1);

            swap(arr,i,idx);

        }
    }





    public void swap(int arr[],int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}