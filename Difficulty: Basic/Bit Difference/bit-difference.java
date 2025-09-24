class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        int  n=(a^b);
       int c=0;
       while(n!=0){
        n=(n&(n-1));
        c++;
       }
       return c;
    }
}
