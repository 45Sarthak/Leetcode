class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int low = 0;
        int count = t.length();

        int min = Integer.MAX_VALUE;
        int start = 0;

        for (int high = 0; high < s.length(); high++) {

            char c = s.charAt(high);

            // Character is required
            if (map.containsKey(c)) {

                if (map.get(c) > 0) {
                    count--;
                }

                map.put(c, map.get(c) - 1);
            }

            // We have all characters of t
            while (count == 0) {

                // Check minimum window
                if (high - low + 1 < min) {
                    min = high - low + 1;
                    start = low;
                }

                // Remove left character
                char left = s.charAt(low);

                if (map.containsKey(left)) {

                    map.put(left, map.get(left) + 1);

                    if (map.get(left) > 0) {
                        count++;
                    }
                }

                low++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + min);
    }
}