class Solution {
    // public int missingNumber(int[] nums) {
    //   Arrays.sort(nums);
	// 	if ((nums.length == 1 && nums[0] == 1 ) || nums[0] == 1)
	// 		return 0;
	// 	int i;
	// 	System.out.println(Arrays.toString(nums));
	// 	for (i = 0; i < nums.length - 1; i++) {
	// 		if (nums[i] != nums[i + 1] - 1) {
	// 			return i + 1;
	// 		}
	// 	}
	// 	return i + 1;	
    // }
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 1; i <= nums.length ; i++) sum += i;
        for(int i : nums) sum -= i;
        if(sum == 0) return 0;
        return sum;
    }
}