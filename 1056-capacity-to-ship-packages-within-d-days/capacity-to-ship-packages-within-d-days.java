class Solution {
    public int shipWithinDays(int[] weights, int d) {
           int low = Integer.MIN_VALUE, high = 0;
        for(int i : weights) {
            high += i;
            low = Math.max(low, i);
            }
        while(low <= high){
            int mid = (high + low)/2;
            int res = findWeight(weights, d, mid);
            // if(res == 0) return mid;
            if(res == -1 || res == 0) high = mid - 1;
            else low = mid + 1;
        }
        return low; 
    }
        public static int findWeight(int [] arr, int d, int mid){
        int sumW = 0, i = 0;
        for(; i < arr.length  && d > 0; i++){
            if(mid >= (sumW+arr[i])){
               sumW += arr[i];
            }else{
                d--;
                sumW = 0;
                sumW += arr[i];
            }
        }
        d--;
        if(d == 0 && i == arr.length) return 0;
        if(d > 0 && i == arr.length) return -1;
        return 1;
    }
}