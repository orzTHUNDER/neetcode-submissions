class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         List<Integer> bucket[] = new List[nums.length + 1];
    for (int i = 0; i < nums.length + 1; i++) {
      bucket[i] = new ArrayList<Integer>();
    }

    System.out.println(bucket);

    Map<Integer, Integer> freq = new HashMap<>();

    // Storing num and its freq in a map
    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    System.out.println(freq);

    // putting the values in the bucket with the bucket id as the FREQUENCY

    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

      bucket[entry.getValue()].add(entry.getKey());
    }

    // Printing the Bucket
    for (int i = 1; i <= nums.length; i++) {
      if (bucket[i].size() != 0) {
        System.out.print(i + " : ");

        for (int a : bucket[i]) {

          System.out.print(a + " ");
        }
        System.out.println();
      }
    }

    int check = 0;
    int ans[] = new int[k];
    for (int i = bucket.length - 1; i > 0; i--) {
      for (int num : bucket[i]) {
        if (check >= k) {
          break;
        }
        ans[check++] = num;

      }
    }

    return ans;
    }

}
