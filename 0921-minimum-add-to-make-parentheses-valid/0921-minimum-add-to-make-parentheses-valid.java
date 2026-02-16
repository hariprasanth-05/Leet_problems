class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Integer> st = new Stack<>();
        int open = 0;
        int close = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            }
            else if(ch == ')' && open > 0){
                open--;
            }
            else{
                close++;
            } 
        }
        return open + close;
    }
}