class Solution {
    public String reverseVowels(String s) {

        StringBuilder res = new StringBuilder(s);
        List<Character> vowels = new ArrayList<>();

        for(int i = s.length()-1; i >= 0 ; i--){
            
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels.add(s.charAt(i));
            }
        }

        int ind = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                res.setCharAt(i,vowels.get(ind++));
            }
        }
        return res.toString();
    }
}