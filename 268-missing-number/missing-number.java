class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum=0;
        for(int i=0; i<n; i++) {
            actualSum += nums[i];
        }
        int expectedSum = n*(n+1)/2;
        int missingNumber = expectedSum - actualSum;
        return missingNumber;

        
    }
}