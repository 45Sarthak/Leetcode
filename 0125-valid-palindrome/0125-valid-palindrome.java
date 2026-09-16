class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        System.out.print(s);
        int high=s.length()-1;
        int low=0;

        while(low< high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }
            else{return false;}
            

        }
        
        

        return true;
    }
}