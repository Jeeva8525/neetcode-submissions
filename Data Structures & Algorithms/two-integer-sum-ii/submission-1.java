class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sz = nums.length;
        int lptr = 0;
        int rptr = sz-1;

        while(lptr < rptr) {
            int sum = nums[lptr] + nums[rptr];
            if(sum == target) {
                return new int[]{lptr+1, rptr+1};
            }
            else if(sum > target) {
                rptr--;
            }
            else {
                lptr++;
            }
        }

        return new int[]{-1, -1};

    }
}
