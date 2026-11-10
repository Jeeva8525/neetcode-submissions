class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer>hm = new HashMap<>();
        for(char c: s.toCharArray()) {
            if(hm.get(c) != null) {
                hm.put(c, hm.get(c)+1);
            }
            else {
                hm.put(c, 1);
            }
        }

        for(char c: t.toCharArray()) {
            if(hm.get(c) == null || hm.get(c) == 0) {
                return false;
            }
            if(hm.get(c) == 1) {
                hm.remove(c);
            }
            else {
                hm.put(c, hm.get(c)-1);
            }
        }

        return hm.isEmpty();
    }
}
