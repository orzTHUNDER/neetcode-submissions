class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();
    int ans[] = new int[k];
    for (int num : nums)
      mp.put(num, mp.getOrDefault(num, 0) + 1);

    System.out.println(mp);

    List<Integer> bucket[] = new List[nums.length + 1];
    for (int i = 0; i < nums.length + 1; i++) {
      bucket[i] = new ArrayList<>();
    }

    for (Map.Entry<Integer, Integer> ent : mp.entrySet()) {
      bucket[ent.getValue()].add(ent.getKey());
    }

    System.out.println(Arrays.toString(bucket));
    k--;
    for (int i = nums.length; i >= 1; i--) {
      if (k < 0)
        break;
      for (int ele : bucket[i]) {
        ans[k--] = ele;
      }
    }
    return ans;

    }

}
