class Solution {
    public int smallestDivisor(int[] arr, int limit) {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
        }
        int low = 1, high = max , ans = -1;
        while(low <= high){
            int mid = (high+low)/2;
            int sum = sumIt(arr, mid, limit);
            if(sum <= limit){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
        public static int sumIt(int [] arr, int mid, int limit){
        int sum = 0;
        for(int i:arr){
            sum += Math.ceil((double)i/mid);
        }
        return sum;
    }
}