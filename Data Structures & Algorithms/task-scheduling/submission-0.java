class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
    for (char task : tasks)
      freq[task - 'A']++;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    for (int fre : freq) {
      if (fre != 0)
        pq.offer(fre);
    }
    // while (!pq.isEmpty())
    // System.out.println(pq.poll());

    int timer = 0;
    Queue<int[]> q = new LinkedList<>();
    while (!pq.isEmpty() || !q.isEmpty()) {

      timer++;

      if (!q.isEmpty()) {
        if (q.peek()[1] == timer) {
          pq.offer(q.poll()[0]);
        }
      }

      if (!pq.isEmpty()) {
        int head = pq.poll();
        if (head > 1) {
          q.add(new int[] { head - 1, timer + n + 1 });
        }

      }
    }

    return timer;
    }
}
