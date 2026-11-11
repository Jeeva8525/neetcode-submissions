class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int num: nums) {
            hs.add(num);
        }

        int curlen = 0;
        int maxlen = 0;
        for(int num: nums) {
            if(!hs.contains(num+1)) {
                curlen = 0;
                int prev = num;
                while(hs.contains(prev)) {
                    curlen++;
                    prev--;
                }
                maxlen = Integer.max(maxlen, curlen);
            }
        }

        return maxlen;
    }
}
