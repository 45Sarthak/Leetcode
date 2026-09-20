class Solution {
    public int reverseDegree(String s) {

        String letter = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder(letter);
        letter = sb.reverse().toString();

        char arr[] = letter.toCharArray();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            for (int j = 0; j < arr.length; j++) {

                if (ch == arr[j]) {
                    int reversePosition = j + 1;

                    result += reversePosition * (i + 1);
                    break;
                }
            }
        }

        return result;
    }
}