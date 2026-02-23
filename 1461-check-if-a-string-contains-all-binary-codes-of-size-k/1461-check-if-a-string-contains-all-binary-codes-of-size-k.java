class Solution {
    public boolean hasAllCodes(String s, int k) {
        int r = 0;
        Set<String> set = new HashSet<>();
        while(r <= s.length()-k){
            set.add(s.substring(r,r+k));
            if(set.size() == Math.pow(2,k)) return true;
            r++;
        }
        return false;
    }
}