class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int reqnumber = target - nums[i];
            if(map.containsKey(reqnumber)){
                return new int[]{map.get(reqnumber), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}