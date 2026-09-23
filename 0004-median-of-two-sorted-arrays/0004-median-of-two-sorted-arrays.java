class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0, k = i;
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            } else {
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k++] = nums1[i];
            i++;
        }
        while(j<n){
            arr[k++] = nums2[j];
            j++;
        }
        int o = arr.length;
        double med = 0;
            if(o%2 == 0){
                med = (arr[o/2-1]+arr[o/2])/2.0;
            }else{
                med = arr[o/2];
            }
        return med;
    }
}