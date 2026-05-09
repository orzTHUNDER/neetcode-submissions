class Solution {
    public boolean isValid(String s) {
    
    Map<Character, Character> m = new HashMap<>();
    m.put('}', '{');
    m.put(']', '[');
    m.put(')', '(');

    Stack<Character> st = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') {
        st.push(ch);
      } else {
        if (st.isEmpty() || st.peek() != m.get(ch)) {
          return false;
        } else {
          st.pop();
        }
      }
    }

    return st.isEmpty();
    
    }
}
