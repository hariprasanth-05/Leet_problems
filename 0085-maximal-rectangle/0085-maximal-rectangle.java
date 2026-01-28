class Solution {
    public int findLargeRect(int[] arr){
        Stack<Integer> st = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int num = st.pop();
                int nse = i;
                int pse = (st.isEmpty()) ? -1 : st.peek();
                int area = arr[num] * (nse -pse -1);
                maxArea = Math.max(area,maxArea);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int num = st.pop();
            int nse = arr.length;
            int pse = (st.isEmpty()) ? -1 : st.peek();
            int area = arr[num] *(nse -pse -1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] pSum = new int[n][m];

        for(int j = m-1; j >= 0; j--){
            int sum = 0;
            for(int i = n-1; i >= 0; i--){
                int num = matrix[i][j] - '0';
                sum += num;
                if(num == 0) sum = 0;
                pSum[i][j] = sum;
            }
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea, findLargeRect(pSum[i]));
        }
        return maxArea;
    }
}