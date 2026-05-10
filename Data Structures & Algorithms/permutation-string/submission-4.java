class Solution {
    public boolean checkInclusion(String s1, String s2) {

         if (s1.length() > s2.length()) {
            return false;
        }

        int l1 = s1.length();
        int l2 = s2.length();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i = 0; i < l1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        
        for(int i = l1; i < l2; i++) {
            if(Arrays.equals(freq1, freq2)) return true;

            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - l1) - 'a']--;

        }

        return Arrays.equals(freq1, freq2);
    }
}
