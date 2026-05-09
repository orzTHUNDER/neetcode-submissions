class KthLargest {

    PriorityQueue<Integer> pq;
    int sz;

    public KthLargest(int k, int[] nums) {
      
        sz = k;
    pq = new PriorityQueue<>();
    for (int num : nums) {

      pq.offer(num);
      if (pq.size() > k)
        pq.poll();

    }
    }
    public int add(int val) {
        pq.add(val);
    if (pq.size() > sz)
      pq.poll();
    return pq.peek();
    }
}
