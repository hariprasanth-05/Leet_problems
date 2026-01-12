class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] avail = new int[26];

        for(char ch : magazine.toCharArray()){
            avail[ch-'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(avail[ch-'a'] <= 0) return false;
            avail[ch-'a']--;
        }
        return true;
    }
}