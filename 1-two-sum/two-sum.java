class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        HashMap<Integer, Integer>hm=new HashMap<>();

        // int i=0;
        // int j=nums.length-1;
        // int sum=Integer.MIN_VALUE;
        // not used the while loop because the array is not sorted!!!
        for(int i=0;i<nums.length;i++){
            //hm.put(nums[i],i);
            int number=target-nums[i];
            if(hm.containsKey(number)){
                return new int[]{hm.get(number),i};
            }
             hm.put(nums[i],i);
           
        }
        return new int[]{-1,-1};
    }
}

        //    for (int i = 0; i < nums.length; i++) {

        //     int complement = target - nums[i];

        //     if (map.containsKey(complement)) {
        //         return new int[]{map.get(complement), i};
        //     }

        //     map.put(nums[i], i);
        // }
