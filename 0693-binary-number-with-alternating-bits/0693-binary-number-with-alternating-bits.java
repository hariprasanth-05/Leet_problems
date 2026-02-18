class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        for(int i = 1; i < bin.length(); i++){
            if(bin.charAt(i-1) == bin.charAt(i)){
                return false;
            }
        }
        return true;
    }
}