class Solution {
    public int[] twoSum(int[] nums, int target ) {

        // Outer loop picks the first number
        for (int i = 0; i < nums.length; i++) {

            // Inner loop picks the second number
            for (int j = i + 1; j < nums.length; j++) {

                // Check if their sum equals the target
                if (nums[i] + nums[j] == target) {

                    // Return the indices
                    return new int[]{i, j};
                }
            }
        }

        // This line will never execute because the question guarantees one solution.
        return new int[]{};
    }
}