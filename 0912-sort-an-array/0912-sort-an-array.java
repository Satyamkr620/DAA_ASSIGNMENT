class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        if(nums == null || nums.length <= 1){
            return nums;
        }
        mergeSort(nums,l,r);
        return nums;
    }
    public void mergeSort(int[] nums,int l,int r){
         if(l<r){
            int mid = l + (r-l)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }
    public void merge(int[] nums, int l , int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0;i<n1;i++){
            arr1[i] = nums[l+i];
        }
        for(int j = 0;j<n2;j++){
            arr2[j] = nums[mid+1+j];
        }
        int i = 0,j=0,k=l;
        while(i<n1 && j < n2){
            if(arr1[i]<=arr2[j]){
                nums[k] = arr1[i];
                i++;
            }else{
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k] = arr1[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }
}