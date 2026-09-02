class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];   // not actually needed

        int odd = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Every parity distribution is transformable
        return true;
      
     

        
        
    }
}