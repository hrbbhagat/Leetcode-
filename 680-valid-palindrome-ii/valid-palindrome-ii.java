class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean ispalindrome=true;

        while(i<j){

            if(s.charAt(i)== s.charAt(j)){
                ispalindrome=true;
        
                
            }
            
            else{
            
               int left = i + 1;
                int right = j;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }
                if (left >= right)
                    return true;

                // option 2 : delete right character
                left = i;
                right = j - 1;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }
                if (left >= right)
                    return true;

                ispalindrome = false;
                return ispalindrome;
    
            
            }
            i++;
            j--;
           
        }
        return ispalindrome;
        
    }
     
}