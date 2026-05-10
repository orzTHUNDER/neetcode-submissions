class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        
        for(int i = 1; i < strs.length; i++) {
            String curr = strs[i];
            while(curr.indexOf(prefix) == -1) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix == "") return "";
        }

        return prefix;
        
    }
}