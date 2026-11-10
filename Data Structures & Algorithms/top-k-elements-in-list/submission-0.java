class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (a, b) -> Integer.compare(a[0], b[0]));

        hm.forEach((key, v) -> {
            pq.offer(new int[]{v, key});

            if(pq.size() > k) {
                pq.poll();
            }
        });

        int[] res = new int[k];
        int x=0;
        while(!pq.isEmpty()) {
            int[] elt = pq.poll();
            res[x++] = elt[1];
        }

        return res;
    }
}
