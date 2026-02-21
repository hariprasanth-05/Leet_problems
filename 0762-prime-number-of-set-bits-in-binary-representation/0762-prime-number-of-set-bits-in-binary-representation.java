class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> prime = new HashSet<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);
        // prime.add(9);
        prime.add(11);
        prime.add(13);
        prime.add(17);
        prime.add(19);
        int res = 0;
        for(int i = left; i <= right; i++){
            String bin = Integer.toBinaryString(i);
            int cnt1 = 0;
            for(int j = 0; j < bin.length(); j++){
                if(bin.charAt(j) == '1') cnt1++;
            }
            if(prime.contains(cnt1)) res++;
        }
        return res;
    }
}