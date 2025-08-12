// User function Template for Java
class Solution {
    static long bitsAreInAltOrder(long n) {
        long prev = n % 2; 
        n = n / 2;        
        while (n > 0) {
            long curr = n % 2; 
            if (curr == prev) {
                return 0; 
            }
            prev = curr; 
            n = n / 2;   
        }
        return 1;
    }
   
    }