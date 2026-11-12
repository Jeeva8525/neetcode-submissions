class Solution {
    public int maxArea(int[] hts) {
        int sz = hts.length;
        int lptr = 0;
        int rptr = sz-1;

        int maxwater = 0;
        while(lptr < rptr) {
            maxwater = Integer.max(maxwater, (rptr - lptr) * Integer.min(hts[lptr], hts[rptr]));
            if(hts[lptr] < hts[rptr]) {
                lptr++;
            }
            else {
                rptr--;
            }
        }
        return maxwater;
    }
}
