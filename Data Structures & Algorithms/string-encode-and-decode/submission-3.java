class Solution {

    public String encode(List<String> strs) {

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < strs.size(); i++) {
      String s = strs.get(i);

      for (int j = 0; j < s.length(); j++) {
        String ascii = String.valueOf((int) s.charAt(j));
        sb.append(ascii.length());
        sb.append(ascii);
      }
      sb.append('-');
    }

    return sb.toString();

  }

  public List<String> decode(String encoded) {

    List<String> ans = new ArrayList<>();

    StringBuilder sb = new StringBuilder();

    int i = 0;

    while (i < encoded.length()) {
      if (encoded.charAt(i) == '-') {
        ans.add(sb.toString());
        sb.delete(0, sb.length());
        if (i == encoded.length() - 1) {
          break;
        }
        i++;
      }
      if (encoded.charAt(i) != '-') {
        int len = encoded.charAt(i) - '0';
        // StringBuilder sb = new StringBuilder();
        String s = encoded.substring(i + 1, len + i + 1);
        char c = (char) Integer.parseInt(s);
        sb.append(c);
        i = i + len + 1;
      }

    }

    return ans;

  }


}
