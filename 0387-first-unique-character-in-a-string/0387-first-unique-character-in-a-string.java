class Solution {
    public int firstUniqChar(String s) {
        int[] hasharr = new int[26];
        for(int i=0; i<s.length(); i++){
            hasharr[s.charAt(i)-'a']++;
        }

        for(int i=0; i< s.length(); i++){
            if(hasharr[s.charAt(i)-'a'] == 1) return i;
        }
        return -1;
    }
}