class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            int cube=digit*digit*digit;
            sum+=cube;
            n=n/10;
        }
            return sum==original;
        
    }
}