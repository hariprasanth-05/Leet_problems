class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        Arrays.sort(ran);
        Arrays.sort(mag);
        int i = 0;
        int j = 0;
        while(i < ran.length && j < mag.length){
            if(ran[i] == mag[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==ran.length) return true;
        else  return false;
    }
}