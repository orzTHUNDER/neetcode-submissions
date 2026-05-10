class Solution {

    void helper(char[] s, int l, int n) {
        if(l >= n / 2) return;
        char temp = s[l];
        s[l] = s[n - l - 1];
        s[n - l - 1] = temp;

        helper(s, l+1, n);
    }

    public void reverseString(char[] s) {

        int n = s.length;

        // for(int i = 0; i < n / 2; i++) {
        //     char c = s[i];
        //     s[i] = s[n - i - 1];
        //     s[n - i - 1] = c;
        // }
        helper(s, 0 , n);
    }
}