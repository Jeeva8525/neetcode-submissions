class Solution {
    public boolean isPalindrome(String s) {
        int sz = s.length();
        int lptr = 0;
        int rptr = sz-1;

        while(lptr < rptr) {
            if(!Character.isLetterOrDigit(s.charAt(lptr))) {
                lptr++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(rptr))) {
                rptr--;
            }
            else if(Character.toLowerCase(s.charAt(lptr)) != Character.toLowerCase(s.charAt(rptr))) {
                return false;
            }
            else {
                lptr++;
                rptr--;
            }
        }

        return true;
    }
}
