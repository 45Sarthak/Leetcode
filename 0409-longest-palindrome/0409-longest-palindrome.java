class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>set=new HashSet<>();

        int len=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                set.remove(ch);
                len+=2;
            }

            else{
                set.add(ch);
            }
        }

        if(!set.isEmpty()){
            len++;
        }

        return len;
    }
}