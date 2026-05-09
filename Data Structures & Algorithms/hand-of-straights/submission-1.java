class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
      return false;
    int groups = hand.length / groupSize;
    Map<Integer, Integer> mp = new HashMap<>();
    for (int i : hand) {
      mp.put(i, mp.getOrDefault(i, 0) + 1);
    }

    for (int num : hand) {
      if (mp.get(num) > 0) {
        int start = num;
        while (mp.getOrDefault(start, 0) != 0)
          start--;
        start++;
        for (int i = start; i <= start - 1 + groupSize; i++) {
          if (mp.getOrDefault(i, 0) == 0)
            return false;

          mp.put(i, mp.get(i) - 1);
        }
      }
    }

    return true;
    }
}
