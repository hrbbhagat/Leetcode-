class Solution {
    public int reverseDegree(String s) {
        int n= s.length();
        int product =0;
        
        for(int i=0;i<s.length();i++){
            int pos=i+1;
            char ch = s.charAt(i);
            int reverseValue = (122 - ch) + 1;
            product+=pos * reverseValue;
        }
        return product;
        
    }
}