class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Using Map instad of Set to avoid deletion of the elements in the current
    // window

    // Handled by map efficiently by storing the position as the value

    // Since the element not present in the current window might also be present in
    // the hashmap we need to handle this speific case

    // zxyxyz

    Map<Character, Integer> m = new HashMap<>();
    int l = 0, r = 0;
    int ans = 0;
    while (r < s.length()) {
      if (m.containsKey(s.charAt(r))) {

        // Handles 2 cases efficiently

        // 1. Taking the l to l + 1

        // 2. Making l as l, if the value present in map not in the current slinding
        // window

        l = Math.max(l, m.get(s.charAt(r)) + 1);
      }
      m.put(s.charAt(r), r);
      ans = Math.max(r - l + 1, ans);
      r++;
    }

    return ans;
        
    }
}
