class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> {
      return x > y ? -1 : 1;
    });
    for (int stone : stones) {
      pq.add(stone);
    }
    System.out.println(pq);
    while (pq.size() > 1) {
      int first = pq.poll();
      int second = pq.poll();
      if (first - second != 0)
        pq.add(first - second);
    }

    return pq.size() == 0 ? 0 : pq.poll();
    }
}
