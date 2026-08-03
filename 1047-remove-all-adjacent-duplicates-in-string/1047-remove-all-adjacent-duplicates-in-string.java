class Solution {
    public String removeDuplicates(String s) {
    String res="";
    String ans="";
    Stack<Character>stack=new Stack<>();
    char []a=s.toCharArray();
    
 
        for(int i=0;i<a.length;i++){
            if(stack.isEmpty()){
                stack.push(a[i]);
                continue;
            }

            else if(stack.peek()==a[i]){
                stack.pop();
                continue;
            }

            else{
                stack.push(a[i]);
            }
        }

        while(!stack.isEmpty()){
            res+=stack.pop();
        }

        for(int i=res.length()-1;i>=0;i--){
            ans+=res.charAt(i);
        }


      
        return ans;
    
    }
}