class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> openIndices = new Stack<>();
    Stack<Integer> starIndices = new Stack<>();

    int i = 0;
    while (i < s.length()) {
      if (s.charAt(i) == '(')
        openIndices.add(i);
      else if (s.charAt(i) == '*')
        starIndices.add(i);
      // Close Paranthesis handling
      else {
        if (!openIndices.isEmpty())
          openIndices.pop();
        else {
          if (!starIndices.isEmpty())
            starIndices.pop();
          else
            return false;
        }
      }
      i++;
    }

    // Handling Remaining Open and Stars
    while (!openIndices.isEmpty()) {
      if (starIndices.isEmpty() || openIndices.peek() > starIndices.peek())
        return false;
      starIndices.pop();
      openIndices.pop();
    }

    return true;
    }
}
