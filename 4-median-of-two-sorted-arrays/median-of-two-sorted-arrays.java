class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;//nums1
        int j=0;//num2
        int k=0;//merge
        //imp part which iahve forget 
        int m=nums1.length;
        int n=nums2.length;


        int merge[]=new int[n+m];
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                i++;
                k++;
            }
            else{
                merge[k]=nums2[j];
                j++;
                k++;
            }

        }
        while(i<m){
            merge[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            merge[k]=nums2[j];
            j++;
            k++;
        }
        int a=merge.length;
        if (a%2!=0){
            return merge[a/2];
        }
        else{
            return (merge[a/2]+merge[a/2-1])/2.0;
        }
    

    }
}