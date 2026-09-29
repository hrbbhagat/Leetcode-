class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //ArrayList<Integer> result=new ArrayList<>();
        int[] result=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            result[i]=-1;
            for(int j=1;j<=nums.length;j++){
                int index = (i + j) % nums.length;
                if(nums[index]>nums[i]){
                    result[i] = nums[index];
                    break;
                }
            }
            
        }
        return  result;
        
    }
}