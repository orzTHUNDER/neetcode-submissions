class Solution {
    public int minimumRecolors(String s, int k) {
        int w = 0, b = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') {
                    w++;
                } else {
                    b++;
                }
            }
        

        int ans = w;

        for (int i = k; i < s.length(); i++) {
            if (s.charAt(i) == 'W') 
                w++;
            else 
                b++;
            if(s.charAt(i - k) == 'W') w--;
            else  b--;
            ans = Math.min(ans, w);
        }

        return ans;
    }
}