class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      List<List<String>> ans = new ArrayList<>();

      Arrays.stream(strs).collect(
        Collectors.groupingBy((str) -> {
          char c[] = str.toCharArray();
          Arrays.sort(c);
          return new String(c);
        })).
        entrySet().forEach((entry) -> ans.add(entry.getValue()));

        return ans;

    }
}
