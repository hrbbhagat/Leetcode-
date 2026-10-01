class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        HashMap<Integer, Integer>hm=new HashMap<>();

        Stack <Integer> s=new Stack<>();
        //s.put(nums2[0]);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                
                hm.put(s.peek(), nums2[i]);
                s.pop();

            }
            
            s.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.getOrDefault(nums1[i], -1);
        } 
        return ans;
        


        
    }
}