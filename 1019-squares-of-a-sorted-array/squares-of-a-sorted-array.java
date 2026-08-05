class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int pos[]=new int[n];
        int neg[]=new int[n];
        int posIndex=0;
        int negIndex=0;
        //division of the array into two parts that are pos and neg:-
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[posIndex]=nums[i];
                posIndex++;
            }
            else{
                neg[negIndex]=nums[i];
                negIndex++;
            }
        }

        //square of the array of the pos and neg
        for(int i=0;i<posIndex;i++){
            pos[i]=pos[i]*pos[i];
        }
        
        for(int i=0;i<negIndex;i++){
            neg[i]=neg[i]*neg[i];
        }

        //reverse of the neg[]
        int temp;
        int left =0;
        int right = negIndex-1;
        while (left<right){
            temp= neg[left];
            neg[left]=neg[right];
            neg[right]=temp;
            left++;
            right--;
        }


        //campare the the index of the array 
        int result[] = new int[negIndex + posIndex];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < negIndex && j < posIndex) {

        if (neg[i] <= pos[j]) {

            result[k] = neg[i];
            i++;
        } else {
        result[k] = pos[j];
        j++;
        }

        k++;
}

// If neg[] still has elements
while (i < negIndex) {
    result[k] = neg[i];
    i++;
    k++;
}

// If pos[] still has elements
while (j < posIndex) {
    result[k] = pos[j];
    j++;
    k++;
} 

   return result;     
    }
}