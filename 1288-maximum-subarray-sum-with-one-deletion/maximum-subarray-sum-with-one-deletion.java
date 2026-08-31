class Solution {
    public int maximumSum(int[] arr) {
        int maxending=arr[0];
        int deleteEnding =Integer.MIN_VALUE/2 ;
        int result= arr[0];
        for(int i =1;i<arr.length;i++){
            int prevMax = maxending;

            
            

        // one deletion logic
        int d1 = prevMax;                  // delete current element
        int d2 = arr[i] + deleteEnding;    // deletion already used
        deleteEnding = Math.max(d1, d2);

        int v1=arr[i];
        int v2=arr[i]+maxending;
        maxending = Math.max(v1, v2);
        

        result=Math.max(result,Math.max(deleteEnding, maxending));
        }
        return result;
    }
}