// class Solution {
//     public int reverse(int x) {
//         int rev = 0;
//         while (n>0){
//             int lastdigit = n%10;
//             rev =(rev *10)+ lastdigit;
//             n=n/10; 
//         }
//         System.out.println(rev);
        
//     }
// }
class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int lastDigit = x % 10;

            // Check positive overflow
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            // Check negative overflow
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            rev = rev * 10 + lastDigit;
            x = x / 10;
        }

        return rev;
    }
}