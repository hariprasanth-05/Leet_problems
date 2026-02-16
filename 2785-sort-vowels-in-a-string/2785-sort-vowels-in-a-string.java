class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if("aeiou".contains(String.valueOf(Character.toLowerCase(ch)))){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        StringBuilder res = new StringBuilder();
        int ind = 0;
        for(char ch : s.toCharArray()){
            if("aeiou".contains(String.valueOf(Character.toLowerCase(ch)))){
                res.append(vowels.get(ind++));
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}