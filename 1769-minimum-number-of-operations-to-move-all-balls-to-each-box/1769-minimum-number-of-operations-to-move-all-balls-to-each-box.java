class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = boxes.charAt(i)-'0';
        }

        int left[] = new int[n];
        int right[] = new int[n];

        int cnt = arr[0];
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] + cnt;
            cnt += arr[i];
        }

        cnt = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] + cnt;
            cnt += arr[i];
        }

        // -+int[] res = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = left[i]+right[i];
        }
        return arr;
    }
}