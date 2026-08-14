class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int low=0;
        int max=0;

        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            while(map.get(s.charAt(right))>2){
                char remove=s.charAt(low);

                map.put(remove,map.get(remove)-1);
                
                if(map.get(remove)==0){
                    map.remove(remove);
                }

                low++;
            }

            max=Math.max(max,right-low+1);
        }

        return max;
    }
}