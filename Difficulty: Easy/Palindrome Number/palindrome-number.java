class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int original=n;
            int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }
        return original==rev;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        int n=555;
        System.out.println(sol.isPalindrome(n));
    }
}