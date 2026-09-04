class Solution {
    public boolean uniformArray(int[] nums1) {
          int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] % 2 == 0) {
                if (nums1[i] < minEven) {
                    minEven = nums1[i];
                }
            } else {
                if (nums1[i] < minOdd) {
                    minOdd = nums1[i];
                }
            }
        }

        // If all numbers are odd or all are even
        if (minOdd == Integer.MAX_VALUE || minEven == Integer.MAX_VALUE) {
            return true;
        }

        return minEven > minOdd;
        
    }
}