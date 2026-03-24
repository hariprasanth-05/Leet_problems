class Solution {
    public String interpret(String command) {
        int n = command.length();
        if(n == 1)return command;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n; i++){
            char ch = command.charAt(i);
            if(ch == '('){
                if(i < n && command.charAt(i+1) == ')'){
                    res.append('o');
                }
            }
            else{
                if(ch != ')'){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}