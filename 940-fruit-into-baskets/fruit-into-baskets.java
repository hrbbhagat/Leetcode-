class Solution {
    public int totalFruit(int[] fruits) {
        int k=2;
         int n = fruits.length;

        int high = 0;
        int low = 0;
        int result = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (high = 0; high < n; high++) {

            // Add current element
            int num = fruits[high];

            hm.put(num, hm.getOrDefault(num, 0) + 1);

            // If unique elements become more than k
            while (hm.size() > k) {

                int leftNum = fruits[low];

                hm.put(leftNum, hm.get(leftNum) - 1);

                if (hm.get(leftNum) == 0) {
                    hm.remove(leftNum);
                }

                low++;
            }

            // Exactly k unique elements
            if (hm.size() == k || hm.size()<k) {

                int length = high - low + 1;

                result = Math.max(result, length);
            }
        }

        return result;
        
    }
}