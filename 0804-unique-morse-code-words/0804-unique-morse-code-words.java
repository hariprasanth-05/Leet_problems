class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            StringBuilder encode = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){
                int ch = words[i].charAt(j)-'a';
                encode.append(code[ch]);
            }
            set.add(encode.toString());
        }
        return set.size();
    }
}