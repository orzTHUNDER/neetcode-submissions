class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
    // Fetching the last occurence of each character in the String
    int lastIdx[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
      lastIdx[s.charAt(i) - 'a'] = i;
    }
    int i = 0;
    int prev = 0;
    while (i <= s.length() - 1) {
      Set<Character> set = new HashSet<>();
      set.add(s.charAt(i));
      int end = lastIdx[s.charAt(i) - 'a'];
      while (i <= end) {
        if (!set.contains(s.charAt(i))) {
          end = Math.max(end, lastIdx[s.charAt(i) - 'a']);
        }
        i++;
      }
      ans.add(i - prev);
      prev = i;
    }
    return ans;
    }
}
