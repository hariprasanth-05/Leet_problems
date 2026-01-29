class Solution {
    public boolean checkPal(String s,int l, int r,int del){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                if(del == 0) return false;
                return checkPal(s,l+1,r,del-1) || checkPal(s,l,r-1,del-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        return checkPal(s, 0, s.length()-1, 1);
    }
}