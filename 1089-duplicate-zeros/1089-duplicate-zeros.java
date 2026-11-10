class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        int [] ans = new int[arr.length+count];
        int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                ans[index++] = 0;
                ans[index++] = 0;
            }else{
                ans[index++] = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = ans[i];
        }

    }
}