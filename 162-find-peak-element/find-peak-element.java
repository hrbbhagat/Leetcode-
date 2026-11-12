class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int n=nums.length;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid < n-1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
        
    }
}