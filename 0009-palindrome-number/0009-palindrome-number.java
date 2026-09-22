

class Solution {
    public boolean isPalindrome(int x) {
       
       int num=x;
       int digit=0;
       if(x<0){
        return false;
       }
       while(x!=0 ){

            int last=x%10;
            digit=digit*10+last;
            x=x/10;
       }

       

       return digit==num;
    }
    
}