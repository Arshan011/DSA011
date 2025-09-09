class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            int square = nums[i] * nums[i];
            temp[i] = square;
        }
        Arrays.sort(temp);
        return temp;
    }
}