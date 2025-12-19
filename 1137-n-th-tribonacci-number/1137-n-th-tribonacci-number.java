class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        for(int i=3; i<=n; i++){
            int sum = list.get(i-1)+list.get(i-2)+list.get(i-3);
            list.add(sum);
        }
        return list.get(list.size()-1);
    }
}