class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
    
    if(s.indexOf(ch)==s.lastIndexOf(ch)){
        return ch;
    }
        }
    return '$';
    }
}
