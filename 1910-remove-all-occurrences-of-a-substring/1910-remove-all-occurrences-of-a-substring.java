class Solution {
    // public String operation(String s,String part){
    //     if(s.length() < part.length() || !s.contains(part)){
    //         return "";
    //     }
    //     String res = s.replace(part,"");
    //     return operation(res,part);
    // }
    public String removeOccurrences(String s, String part) {
        // return operation(s,part);
        
        while(s.contains(part)){
            s = s.replaceFirst(part,""); 
        }
        return s;
    }
}