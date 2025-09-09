class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        int[] result = new int[n];
        int i = n-1;  //start filling result array backward

        while(left <= right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            if(leftsquare > rightsquare){
                result[i] = leftsquare;
                left++;
            }else {
                result[i] = rightsquare;
                right--;
            }
            i--;
        }
        return result;
    }
}