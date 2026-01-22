class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k > 0 && (st.peek()-'0') > (ch -'0')){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        while(res.length() > 0 && res.charAt(res.length()-1) == '0'){
            res.deleteCharAt(res.length()-1);
        }
        res.reverse();
        if(res.length() == 0) return "0";
        return res.toString();
    }
}