class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenR=ransomNote.length();
        int lenM=magazine.length();
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        for(int i=0;i<lenR;i++){
            char ch=ransomNote.charAt(i);

            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<lenM;i++){
            char ch=magazine.charAt(i);

            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if(map1.size() > map2.size()){
            return false;
        }

        for(int i=0;i<lenR;i++){
            char ch=ransomNote.charAt(i);
            
            if (!map2.containsKey(ch) || map1.get(ch) > map2.get(ch)) {
                return false;
            }
        }
        return true;

    }
}