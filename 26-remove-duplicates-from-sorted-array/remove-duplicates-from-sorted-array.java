class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(nums.length == 0){
            return -1;}
            int i = 0;
            for(int j=i; j<n; j++){
                if(nums[i] != nums[j]){
                    nums[i+1] = nums[j];
                    i++;
                }
            }
            return i+1;
        }
    }
