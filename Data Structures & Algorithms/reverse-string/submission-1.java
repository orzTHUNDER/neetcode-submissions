class Solution {

    void helper(char[] s, int l, int r) {
        if(l >= r) return;
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        helper(s, l+1, r-1);
    }

    public void reverseString(char[] s) {

        int n = s.length;

        // for(int i = 0; i < n / 2; i++) {
        //     char c = s[i];
        //     s[i] = s[n - i - 1];
        //     s[n - i - 1] = c;
        // }
        helper(s, 0 , n - 1);
    }
}