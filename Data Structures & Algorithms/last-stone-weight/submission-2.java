class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> {
      return x > y ? -1 : (x == y) ? 0 : 1;
    });
    for (int stone : stones) {
      pq.add(stone);
    }
    while (pq.size() > 1) {
      pq.add(pq.poll() - pq.poll());
    }

    return pq.poll();
}
}
