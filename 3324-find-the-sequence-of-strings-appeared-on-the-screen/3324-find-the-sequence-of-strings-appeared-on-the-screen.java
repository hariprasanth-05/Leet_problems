class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(char ch : target.toCharArray()){
            int charNum = ch-'a'; 
            for(int j = 0; j <= charNum; j++){
                char c = (char)('a' + j);
                list.add(sb.toString()+String.valueOf(c));
            }
            sb.append(ch);
        }
        return list;
    }
}