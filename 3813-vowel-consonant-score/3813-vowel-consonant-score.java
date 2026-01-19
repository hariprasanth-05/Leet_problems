class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    v++;
                }
                else c++;
            }
        }
        if(c > 0){
            return (int)Math.floor(v / c);
        }
        else return 0;
    }
}