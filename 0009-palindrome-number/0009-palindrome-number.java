class Solution {
    public boolean isPalindrome(int x) {
        int ognum = x;
        int reversed = 0;
        if(x < 0) return false;
        while ( x != 0 || x > 0) {
            int extract = x % 10;
            reversed = reversed * 10 + extract;
            x = x / 10;
        }
        return ognum == reversed;
    }
}