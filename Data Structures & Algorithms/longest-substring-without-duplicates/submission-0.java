class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int sz = s.length();
        int maxlen = 0;

        while(r < sz) {
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0)+1);
            
            while(hm.getOrDefault(s.charAt(r), 0) == 2) {
                hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
                l++;
            }
            
            maxlen = Integer.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
}
