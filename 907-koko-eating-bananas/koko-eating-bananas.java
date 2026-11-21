class Solution {
    public int minEatingSpeed(int[] piles, int h ) {
        int n=piles.length;
        int low=1;
       
        int max=0;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int high=max;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long requiredHours =fun(piles, mid, n);
            
            if(requiredHours >h ){//no
               low=mid+1;

            } 
            else{
                result=mid;
                high=mid-1;
            }
        }
        return result;

        
    }

    public static long fun(int piles[], int speed, int n){
        long totalHours=0;
        for(int i=0;i<n;i++){
            totalHours = totalHours +piles[i]/speed;
            if(piles[i]% speed!=0){
                totalHours++;
            }
            
        }
        return totalHours;
    }
}