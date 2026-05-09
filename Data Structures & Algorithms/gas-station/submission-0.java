class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {
      int start = (i + 1) % gas.length;
      int rem = gas[i] - cost[i];
      while (start != i) {
        if (rem < 0)
          break;
        rem = gas[start] + rem - cost[start];
        start = (start + 1) % gas.length;
      }
      if (start == i && rem >= 0)
        return i;
    }

    return -1;
        
    }
}
