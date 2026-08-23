class Solution {
    public String isAutomorphic(int n) {
        // code here
        int divisor=1;
        int temp=n;
        int square=n*n;
        while(temp>0){
            divisor=divisor*10;
            temp=temp/10;
        }
        if(square%divisor==n){
             return "Automorphic";
        }
        else{
             return "Not Automorphic";
        }
    }
}