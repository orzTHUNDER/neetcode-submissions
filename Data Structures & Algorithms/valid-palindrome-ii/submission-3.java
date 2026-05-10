class Solution {
    public boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        boolean deleted = false;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                deleted = true;

                //delete char at "j"
                int j1 = j;
                int i1 = i;
                j1--;
                while(i1 < j1) {
                    if(s.charAt(i1) != s.charAt(j1)) {
                        break;
                    }
                    i1++;
                    j1--;
                }

                if(i1 >= j1) return true;


                //delete char at "i"
                i++;
                while(i < j) {
                    if(s.charAt(i) != s.charAt(j)) {
                        break;
                    }
                    i++;
                    j--;
                }

            if(i >= j) return true;

            }
            i++;
            j--;
        }

        return !deleted;


    }
}