class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int number=nums1[i];
            result[i]= -1;
            int position=-1;

            for(int j=0;j<nums2.length;j++){
                if (number ==nums2[j]){
                    position=j;
                    break;

                }
            
            }
            for(int j=position+1;j<nums2.length;j++){
        
                if(number<nums2[j]){
                    result[i]=nums2[j];
                    break;
                    
                    

                }
                else {
                    result[i]=-1;
                    

                }

            }
            

        }
        return result;
        
    }
}