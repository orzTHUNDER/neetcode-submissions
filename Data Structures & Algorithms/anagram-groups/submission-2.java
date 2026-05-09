class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
    Map<String, List<String>> mp = new HashMap<>();

    for (String str : strs) {
      int[] count = new int[26];
      for (char c : str.toCharArray()) {
        count[c - 'a']++;
      }
      String key = Arrays.toString(count);
      // System.out.println(key);
      List<String> val = mp.getOrDefault(key, new ArrayList<>());
      val.add(str);
      mp.put(key, val);
    }
    for (String s : mp.keySet()) {
      // System.out.println(s);
      ans.add(mp.get(s));
    }
    return ans;

    }
}
