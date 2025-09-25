class Solution {
    public int strStr(String haystack, String needle) {
        int heylen = haystack.length();
        int neelen = needle.length();
        
        if(heylen < neelen) return -1;
        for(int i = 0; i < (heylen-neelen)+1 ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,neelen+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}