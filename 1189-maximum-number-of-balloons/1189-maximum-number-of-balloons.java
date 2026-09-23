class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        
        String m="balloon";

        for(int i=0; i<m.length();i++){
            char ch=m.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
       
       int min=Integer.MAX_VALUE;
       for(char ch:map.keySet()){

            int required=map.get(ch);
            int avaliable=map2.getOrDefault(ch,0);
            int count=avaliable/required;

            min=Math.min(min,count);
       }

        return min;
    }
}