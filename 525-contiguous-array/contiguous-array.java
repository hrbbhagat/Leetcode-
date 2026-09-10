class Solution {
    public int findMaxLength(int[] nums) {
        int one=0;
        int zero=0;
        HashMap<Integer, Integer> hm= new HashMap<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff=zero-one;
            if(diff==0){
                result=Math.max(result,i+1);
                continue;
            }

            if(hm.containsKey(diff)){ //hai 
                int idx=hm.get(diff);
                int len=i-idx;
                result=Math.max(result,len);
            }
            else{// nhi hai
                 hm.put(diff, i); 
              

            }

        }
        return result;
        
    }
}