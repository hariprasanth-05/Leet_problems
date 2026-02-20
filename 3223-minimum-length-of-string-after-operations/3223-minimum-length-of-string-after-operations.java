class Solution {
    public int minimumLength(String s) {
        int[] hash = new int[26]; 
        for(char ch : s.toCharArray()){
            hash[ch-'a']++;
        }
        int min = 0;
        for(int num : hash){
            if(num % 2 == 0 && num != 0){
                min += 2;
            }
            else if(num % 2 != 0 && num != 0){
                min += 1;
            }
        }
        return min;
    }
}