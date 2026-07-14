class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList<Integer>list=new ArrayList<>();
        helper(0,nums,list);
        return ans;
    }

    public void helper(int idx,int arr[],ArrayList<Integer>list){

        ArrayList<Integer>temp=new ArrayList<>();

        for(int i=0;i<list.size();i++){
                temp.add(list.get(i));
            }
        ans.add(temp);



        if(idx==arr.length){
            return;
        }


        for(int i=idx;i<arr.length;i++){
            list.add(arr[i]);

            helper(i+1,arr,list);

            list.remove(list.size()-1);

           
        }
    }
}