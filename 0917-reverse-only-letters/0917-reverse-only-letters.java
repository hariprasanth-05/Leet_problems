class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                list.add(ch[i]);
            }
        }
        int ind = list.size()-1;
        for(int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                ch[i] = list.get(ind--);
            }
        }
        String str = new String(ch);
        return str;
    }
}