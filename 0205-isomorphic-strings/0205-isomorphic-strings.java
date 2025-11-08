class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();
        int tlen = t.length();
        if(sLen != tlen) return false;

        Map<Character,Character> smpp = new HashMap<>();
        Map<Character,Character> tmpp = new HashMap<>();
        for(int i=0; i < s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(smpp.containsKey(c1)){
                if(smpp.get(c1) != c2) return false;
                
            }else{
                smpp.put(c1,c2);
            }

            if(tmpp.containsKey(c2)){
                if(tmpp.get(c2) != c1) return false;
                
            }else{
                tmpp.put(c2,c1);
            }
        }

        return true;
    }
}