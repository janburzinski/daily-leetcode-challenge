class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 0) return true;

        boolean isIncr = true;
        boolean isDecr = true;

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int prevNum = nums[i-1];
            // steigend
            if(num > prevNum)
                isIncr = false;

            // fallend
            if(num < prevNum) isDecr = false;
        }

        return isIncr || isDecr;
    }
}