class Solution {

    boolean isAlphanumeric(char c) {

        if( (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }   
        return false;
    }

    public boolean isPalindrome(String s) {

        if(s.length() == 1) return true;

        s = s.toLowerCase();
        int i = 0, n = s.length(), j = n - 1;

        while(i <= j) {
            while(i < j && !isAlphanumeric(s.charAt(i))) i++;
            while(j > i && !isAlphanumeric(s.charAt(j))) j--;

            if(i > j || j < i) return false;

            if(s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
        
    }
}
