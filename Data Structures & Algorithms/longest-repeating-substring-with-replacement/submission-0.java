class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0, maxFreq = 0, maxLen = 0;
        int freq[] = new int[26];

        for(int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            while( (r - l + 1) - maxFreq > k) {

                freq[s.charAt(l) - 'A']--;
                for(int i = 0; i < 26; i++) {
                    maxFreq = Math.max(maxFreq, freq[i]);
                }
                l++;


            }
            
            maxLen = Math.max(maxLen, r - l + 1);
            

        }

        return maxLen;
    
    }
}
