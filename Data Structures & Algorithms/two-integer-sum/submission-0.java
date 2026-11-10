class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x=0; x<nums.length; x++) {
            if(hm.get(target-nums[x]) != null) {
                return new int[]{hm.get(target-nums[x]), x};
            }
            hm.put(nums[x], x);
        }
        return new int[]{-1, -1};
    }
}
