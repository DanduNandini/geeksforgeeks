class Solution {
    public boolean isKaprekar(int n) {
        // code here
        int square=n*n;
        int divisor=1;
        int temp=n;
        while(temp>0){
            divisor=divisor*10;
            temp=temp/10;
        }
        int right=square%divisor;
        int left=square/divisor;
        int sum=right+left;
         return sum==n;
         
    }
}