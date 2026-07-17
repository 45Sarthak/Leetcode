class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<Integer>list=new ArrayList<>();
        helper(candidates,0,list,target);

        return ans;
        
    }

    public void helper(int arr[],int index,ArrayList<Integer> list,int target){
        if(target<0){
            return ;
        }
        ArrayList<Integer> temp=new ArrayList<>();

        if(target==0){
            for(int i=0;i<list.size();i++){
                temp.add(list.get(i));
            }
            ans.add(temp);
            return;
        }


        for(int i=index;i<arr.length;i++){

            // add element
            list.add(arr[i]);

            //include next index
            helper(arr,i,list,target-arr[i]);
            
            // //include same index
            // helper(arr,index,list,target-arr[i]);
            

            //backtrack
            list.remove(list.size()-1);

        }
    }
}