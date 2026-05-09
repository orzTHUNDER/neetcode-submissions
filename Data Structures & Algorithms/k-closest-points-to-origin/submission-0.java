class Solution {
    public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> {
      int d1 = (p1[0] * p1[0]) + (p1[1] * p1[1]);
      int d2 = (p2[0] * p2[0]) + (p2[1] * p2[1]);
      return d2 - d1;
    });

    for (int[] point : points) {
      pq.offer(point);

      if (pq.size() > k) {
        pq.poll();
      }
    }

    // while (!pq.isEmpty()) {
    // System.out.println(Arrays.toString(pq.poll()));
    // }
    // System.out.println(Arrays.toString(pq.peek()));
    int[][] ans = new int[k][2];

    while (!pq.isEmpty()) {
      ans[k-- - 1] = pq.poll();
    }

    return ans;

    }
}
