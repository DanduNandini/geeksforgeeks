class Solution {
    public boolean checkSpy(int n) {
        // code here
        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;
            sum=digit+sum;
            product=digit*product;
            n=n/10;
        }
        return sum==product;
    }
}
