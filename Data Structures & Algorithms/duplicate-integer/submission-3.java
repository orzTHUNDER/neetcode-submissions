class Solution {
    public boolean hasDuplicate(int[] nums) {

        // Approach- 1

        // Set<Integer> m = new HashSet<>();
        // for(int i = 0; i < nums.length; i++) {
        //     if(!m.add(nums[i])) return true;
        // }
        // return false;


        //Approach - 2
        return Arrays.stream(nums).distinct().count() != nums.length;


    }
}
