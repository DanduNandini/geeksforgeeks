class Solution {
    int majorityElement(int nums[]) {
        int c= 0;
        int elt=0;
        for (int a : nums) {
            if (c == 0) {
                elt = a;
                c=1;;
            }
           else if(a==elt){
           
            c++;
            
        }
        else{

        c--;
        }
        }
         c = 0;
        for(int a:nums){
            if(a==elt)
                c++;
        }
        if(c>nums.length/2){
            return elt;
        }
        return -1;
    }
}

     
         
          
        

 