class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        ArrayList<Integer>list=new ArrayList<>();
        helper(candidates,0,list,target);
        return ans;

        
    }

    public void helper(int arr[],int index,ArrayList<Integer> list,int target){
        ArrayList<Integer> temp=new ArrayList<>();

        if(target<0){
            return;
        }
        if(target==0){
            for(int i=0;i<list.size();i++){
                temp.add(list.get(i));
            }

            ans.add(temp);
            return;
        }

        for(int i=index;i<arr.length;i++){

            if(i>index && arr[i]==arr[i-1]){continue;}
                    

            list.add(arr[i]);

            helper(arr,i+1,list,target-arr[i]);

            list.remove(list.size()-1);
        }
        

    }
}