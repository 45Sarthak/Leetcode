class Solution {
    public boolean checkInclusion(String s1, String s2) {
    

     if(s1.length() > s2.length()){
        return false;
    }

    int low=0;
    HashMap<Character,Integer> map=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();

    for(int i=0;i<s1.length();i++){
        map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
    }

    for(int i=0;i<s1.length();i++){
        map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
    }


    if(map.equals(map2)){
        return true;
    }

   int high = s1.length();
    while(high<s2.length()){
        map2.put(s2.charAt(low),map2.get(s2.charAt(low))-1);
        if(map2.get(s2.charAt(low))==0){
            map2.remove(s2.charAt(low));
        }
        low++;

        map2.put(s2.charAt(high),map2.getOrDefault(s2.charAt(high),0)+1);
        high++;

        if(map.equals(map2)){
            return true;
        }        

    }
    return false;       
    }
}