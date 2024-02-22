class Solution {
    public int splitArray(int[] nums, int k) {
    int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low <= high){
            int mid =  low + (high-low)/2;
            int subArr = check(nums, k, mid);
            if(subArr <= k) high = mid-1;
            else low = mid+1;   
        }
        return low;
    }
    public static int check(int [] arr, int k, int mid){
        int subArr = 1, sum = 0;
        for(int ele : arr){
            if((ele+sum) <= mid){
                sum += ele;
            }else{
                subArr++;
                sum = ele;
            }
        }
        return subArr;
    }
}