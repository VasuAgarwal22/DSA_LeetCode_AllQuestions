class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums,0,nums.length-1);
       return nums;
    }
    private void mergeSort(int [] nums , int start , int end){
        if(start>=end) return;
        int mid = start+(end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    private void merge(int [] nums , int start , int mid, int end){
        int [] m1 = new int[mid-start+1];
        int [] m2 = new int[end-mid];
        for(int k = 0;k<m1.length;k++) m1[k] = nums[start+k];
        for(int k = 0;k<m2.length;k++) m2[k] = nums[mid+1+k];
        int i=0;
        int j=0;
        int k = start;
        while(i<m1.length && j<m2.length){
            if(m1[i]<=m2[j]){
                nums[k++]=m1[i++];
            }else{
                nums[k++]=m2[j++];
            }
        }
        while(i<m1.length){
            nums[k++]=m1[i++];
        }
        while(j<m2.length){
            nums[k++]=m2[j++];
        }
    }
}