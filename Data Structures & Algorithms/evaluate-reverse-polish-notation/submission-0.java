class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
    for (String token : tokens) {
        System.out.println(token);
      if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
        st.push(Integer.parseInt(token));
        System.out.println(st.toString());
      } else {
        int a = st.pop();
        int b = st.pop();
        int out = 0;
        switch (token) {
          case "+":
            out = a + b;
            break;
          case "-":
            out = b - a;
            break;
          case "*":
            out = b * a;
            break;
          case "/":
            out = b / a;
            break;
          default:
            break;
        }
        st.push(out);
      }
    }
    return st.pop();
        
    }
}
