class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> m = new HashMap<>();
        
        for(String str: strs) {
            char tempArray[] = str.toCharArray();
            Arrays.sort(tempArray);
            String temp = new String(tempArray);
            
            m.computeIfAbsent(temp, (k)->new ArrayList<String>()).add(str);
            
            
        }
        List<List<String>> ans = new ArrayList<>();
        m.forEach((k, v) -> {
            
            List<String> each = new ArrayList<>();
            
            for(String s: v) {
                each.add(s);
            }
            
            ans.add(each);
            
        });
        
        return ans;
    }
}
