class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String k = "";
        k+=x;
        for(int i = 0; i < words.length; i++){
            if(words[i].contains(k)){
                list.add(i);
            }
            
        }
        return list;
    }
}