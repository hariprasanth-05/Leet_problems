class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }

        for(int i = 0; i < words.length; i++){
            boolean isNot = false;
            for(int j = 0; j < words[i].length(); j++){
                if(!set.contains(words[i].charAt(j))){
                    isNot = true;
                    break;
                }
            }
            if(isNot){
                cnt++;
            }
        }
        return words.length - cnt;
    }
}