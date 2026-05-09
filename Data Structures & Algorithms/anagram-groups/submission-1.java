class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<List<Integer>, List<String>> m = new HashMap<>();

    for (String str : strs) {
      List<Integer> freq = new ArrayList<>(Collections.nCopies(26, 0));

      for (int i = 0; i < str.length(); i++) {
        freq.set(str.charAt(i) - 'a', freq.get(str.charAt(i) - 'a') + 1);

      }
      // System.out.println(freq);
      m.computeIfAbsent(freq, (k) -> new ArrayList<>()).add(str);
    }

    List<List<String>> ans = new ArrayList<>();
    m.forEach((k, v) -> {

      List<String> each = new ArrayList<>();

      for (String s : v) {
        each.add(s);
      }

      ans.add(each);

    });
        
        return ans;
    }
}
