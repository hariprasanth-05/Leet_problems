class Solution {
    public boolean isPalindrome(int x) {
        String str = x+"";
        int len = str.length();
        for(int i=0; i<len; i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(len-i-1);
            if(c1 != c2){
                return false;
            }
        }
        
        return true;
    }
}