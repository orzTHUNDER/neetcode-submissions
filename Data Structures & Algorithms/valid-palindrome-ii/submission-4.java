class Solution {

    boolean isPalindrome(String s, int i, int j) {

        String subStr = s.substring(i, j + 1);

        return new StringBuilder(subStr).reverse().toString().equals(subStr);

    }
    public boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1;
       
        while(i < j) {

            if(s.charAt(i) !=  s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i , j - 1);
            }

            i++;
            j--;
        }

        return true;
    }
}