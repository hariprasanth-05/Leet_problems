class Solution {
    public boolean rotateString(String s, String goal) {
        int sLen = s.length();
        int goalLen = goal.length();
        if(sLen != goalLen) return false;
        for(int i=0; i<sLen; i++){
            String str = s.substring(sLen-i-1)+s.substring(0,sLen - i-1);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}