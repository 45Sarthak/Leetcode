class Solution {
   List<String> ans= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String map[]={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        if(digits.length()==0){
            return ans;
        }

        helper(0, digits, map, "");
        return ans;
    }


    public void helper(int index, String digits, String[] map, String current){
        if(index==digits.length()){

            ans.add(current);
            return;
        }

         String letters = map[digits.charAt(index) - '0'];

        // Har letter ko choose karo
        for(int i = 0; i < letters.length(); i++){

            char ch = letters.charAt(i);

            helper(index + 1, digits, map, current + ch);
        }

               
    }
}