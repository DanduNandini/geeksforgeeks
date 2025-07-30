class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
          ArrayList<Integer> row=new ArrayList<>();
           int m=1;
           
           for(int j=0;j<n;j++){
            row.add(m);
            m=m*(n-j-1)/(j+1);
           }
           return row;
        }
        
    }
        
        
        

