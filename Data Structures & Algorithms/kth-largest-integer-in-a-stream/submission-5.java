class KthLargest {

    PriorityQueue<Integer> pq;
    int sz;

    public KthLargest(int k, int[] nums) {
      sz = k;
       pq = new PriorityQueue<>();
    for (int num : nums) {

      if (pq.size() < k) {
        pq.add(num);
      } else {
        if (pq.peek() < num) {
          pq.poll();
          pq.add(num);
        }
      }

    }
    System.out.println(pq);
    }
    
    public int add(int val) {
        if (pq.size() < sz) {
      pq.add(val);
      return pq.peek();
    }
    if (pq.peek() < val) {
      pq.poll();
      pq.add(val);
    }
    return pq.peek();
    }
}
