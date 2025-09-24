// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> a =new ArrayList<>();
        int n=s.length();
        for(int i=0;i<(1<<n);i++){
           StringBuilder sublist =new StringBuilder();
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0)
                  sublist.append(s.charAt(j));
            }
            a.add(sublist.toString());
        }
        Collections.sort(a);
        return a;
    }
}