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
        long rev = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            rev = rev * 10 + lastdigit;
            x = x / 10;
        }
        if (rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE){
            rev=0;
        }

        return (int)rev;
    }
}