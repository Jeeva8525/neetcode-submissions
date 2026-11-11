class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sz = nums.length;
        int[] prefix = new int[sz];
        int[] suffix = new int[sz];

        prefix[0] = 1;
        suffix[sz-1] = 1;
        for(int x = 1; x<sz; x++) {
            prefix[x] = nums[x-1] * prefix[x-1];
            suffix[sz-x-1] = nums[sz-x] * suffix[sz-x];
        }

        int res[] = new int[sz];
        for(int x=0; x<sz; x++) {
            res[x] = prefix[x] * suffix[x];
        }

        return res;
    }
}  
