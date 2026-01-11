class Solution {
    public boolean wordPattern(String pattern, String s) {
         
        String[] word = s.split(" ");
        char[] pat = pattern.toCharArray();
        if(word.length != pat.length) return false;

        Map<Character,String> mpp1 = new HashMap<>();
        Map<String,Character> mpp2 = new HashMap<>();

        boolean flag1 = true;
        for(int i=0; i < word.length; i++){
            char key = pattern.charAt(i);
            String val = word[i];
            if(mpp1.containsKey(key)){
                if(!mpp1.get(key).equals(val)){
                    return false;
                }
            }
            else mpp1.put(key,val);
            
        }

        for(int i=0; i < word.length; i++){
            String key = word[i];
            char val = pattern.charAt(i);
            if(mpp2.containsKey(key)){
                if(!mpp2.get(key).equals(val)){
                    return false;
                }
            }
            else mpp2.put(key,val);
            
        }

        return true;
    }
}