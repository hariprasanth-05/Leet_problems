class Solution {
    public int reverseDegree(String s) {
        int d = 0;
        for(int i = 0; i < s.length(); i++){
            d += ('z'- s.charAt(i)+1)*(i+1);
        }
        return d;
    }
}