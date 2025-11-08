class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int left = 0;
        int right = nums1.length;
        while(left <= right){
            int cut1 = (left + right)/2;
            int cut2 = (nums1.length + nums2.length +1)/2 - cut1;

            int maxleft1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1-1];
            int minright1 = (cut1 == nums1.length) ? Integer.MAX_VALUE : nums1[cut1];

            int maxleft2 = (cut2==0) ? Integer.MIN_VALUE : nums2[cut2-1];
            int minright2 = (cut2 == nums2.length) ? Integer.MAX_VALUE : nums2[cut2];

            if(maxleft1 <= minright2  &&  maxleft2 <= minright1){
                if((nums1.length + nums2.length)%2==0) {
                    return (double)(Math.max(maxleft1, maxleft2) + Math.min(minright1, minright2))/2;
                }else{
                    return (double)Math.max(maxleft1, maxleft2);
                }
            }else if(maxleft1 > minright2){
                right = cut1-1;
            }else{
                left = cut1+1;
            }
        }
        return 0.0;
    }
}