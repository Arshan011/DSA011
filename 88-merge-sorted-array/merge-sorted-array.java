class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        for(int i = 0; i<m; i++){
            temp[i] = nums1[i];
        }
        for(int i = 0; i<n; i++){
            temp[m+i] = nums2[i];
        }
        Arrays.sort(temp);
        for(int i = 0; i<temp.length; i++){
            nums1[i] = temp[i];
        }
    }
}