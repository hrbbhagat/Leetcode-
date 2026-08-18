class Solution {

    public int longestOnes(int[] nums, int k) {

        int low = 0;
        int zeroCount = 0;
        int result = 0;

        for (int high = 0; high < nums.length; high++) {

            // Add current element to the window
            if (nums[high] == 0) {
                zeroCount++;
            }

            // If window has more than k zeroes,
            // shrink it from the left
            while (zeroCount > k) {

                if (nums[low] == 0) {
                    zeroCount--;
                }

                low++;
            }

            // Current window is valid
            result = Math.max(result, high - low + 1);
        }

        return result;
    }
}