class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
        return "";
        }

        HashMap<Character, Integer> hm= new HashMap<>();

        // Store frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int low = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int high = 0; high < s.length(); high++) {

            char right = s.charAt(high);

            if (hm.containsKey(right)) {
                if (hm.get(right) > 0) {
                    count--;
                }
                hm.put(right, hm.get(right) - 1);
            }

            while (count == 0) {

                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                char left = s.charAt(low);

                if (hm.containsKey(left)) {
                    hm.put(left, hm.get(left) + 1);

                    if (hm.get(left) > 0) {
                        count++;
                    }
                }

                low++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    

            
        }



        
    }
