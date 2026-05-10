class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // int i = 0, j = numbers.length - 1;

        // while(i < j) {
        //     int sum = numbers[i] + numbers[j];
        //     if(sum > target) j--;
        //     else if (sum < target) i++;
        //     else return new int[]{i + 1, j + 1};
        // }

        for(int i = 0; i < numbers.length - 1; i++) {
            int idx = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if(idx >= 0) {
                return new int[]{i + 1, idx + 1};
            }
        }

        return new int[]{-1, -1};
        
    }
}
