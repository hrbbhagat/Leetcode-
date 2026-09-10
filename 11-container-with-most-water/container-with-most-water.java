class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=0;
        while(i<j){
            int width=j-i;
            int containerHeight =Math.min(height[i], height[j]);  
            int currarea=containerHeight * width;
            area=Math.max(currarea ,area );
            if (height[i] < height[j]){
                i++;
            }
            else{
            j--;
            }


        }
        return area;
        
    }
}