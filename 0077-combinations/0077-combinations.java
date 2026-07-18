class Solution {
    List<List<Integer>>ans =new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {

        ArrayList<Integer> list=new ArrayList<>();

        helper(1,n,k,list);

        return ans;
                
    }

    public void helper(int index,int n,int k,ArrayList<Integer> list){
        if(list.size()==k){
          
          List<Integer> temp=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                temp.add(list.get(i));
            }

            ans.add(temp);
            return;
        }


        for(int i=index;i<=n;i++){
            list.add(i);

            helper(i+1,n,k,list);

            list.remove(list.size()-1);
        }
    }
}