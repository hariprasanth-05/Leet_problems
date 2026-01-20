class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        if(n == 1) return new int[]{-1};
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1; i >= 0; i--){
            int ind = i % n;
            while(!st.isEmpty() && st.peek() <= arr[ind]){
                st.pop();
            }
            if( i < n){
                if(st.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = st.peek();
            }
            st.push(arr[ind]);
        }
        return ans;
    }
}