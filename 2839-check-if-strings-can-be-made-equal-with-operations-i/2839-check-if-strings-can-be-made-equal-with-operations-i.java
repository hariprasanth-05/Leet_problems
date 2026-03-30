class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n = s1.length();
        int i = 0;
        // int j = 0;
        while(i < n){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
                continue;
            }
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt((i+2) % n);
            if(ch1 != ch2) return false;
            i++;
        }
        return true;
    }
}