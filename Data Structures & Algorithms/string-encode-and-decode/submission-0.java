class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String s: strs) {
            res += s.length() + "#" + s;
        }
        // System.out.println(res);
        return res;
    }

    public List<String> decode(String str) {
        // return new LinkedList<String>();

        int len = 0;
        int idx = 0;
        List<String> res = new LinkedList<>();
        while(idx < str.length()) {
            String num = "";
            while(str.charAt(idx) != '#') {
                num += str.charAt(idx);
                idx++;
            }
            idx++;

            len = Integer.parseInt(num);
            int lim = idx + len;
            String s = "";
            while(idx < lim) {
                s += str.charAt(idx);
                idx++;
            }

            res.add(s);
            // idx++;
        }
        return res;
    }
}
