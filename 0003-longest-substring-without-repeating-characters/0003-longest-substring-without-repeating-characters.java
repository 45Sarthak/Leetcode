class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.get(ch)>1){
                char leftE=s.charAt(left);
                map.put(leftE,map.get(leftE)-1);

                if(map.get(leftE)==0){

                    map.remove(leftE);
                }
                left++;
            }

        max=Math.max(max,high-left+1);
        }

        return max;
    }
}