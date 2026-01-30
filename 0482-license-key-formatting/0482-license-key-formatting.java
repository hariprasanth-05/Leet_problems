class Solution {
    public String licenseKeyFormatting(String s, int k) {
        List<Character> list = new ArrayList<>();
        for(int i = s.length()-1; i >= 0; i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char ch = s.charAt(i);
                if(Character.isLetter(ch)){
                    ch = Character.toUpperCase(ch);
                } 
                list.add(ch);
            }
        }
        System.out.print(list);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            char ch = list.get(i);
            if(i != 0 && i % k == 0){
                res.append('-');
            }
            res.append(ch);
        }
        return res.reverse().toString();
    }
}