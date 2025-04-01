class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int j = 0; // speichert eindeutige elemente; wird für den return und überprüfen verwendet
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
}