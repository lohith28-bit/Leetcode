class Solution {
    public int minEatingSpeed(int[] v, int h) {
          int low = 1, high = Arrays.stream(v).max().getAsInt();
        while (low <= high) {
           int mid = low + (high - low)/2;
            int totalHrs = 0;
            for (int i = 0; i < v.length; i++) {
            totalHrs += Math.ceil((double)(v[i]) / (double)(mid));
            }
            if (totalHrs <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
         }
        return low;
    }
}