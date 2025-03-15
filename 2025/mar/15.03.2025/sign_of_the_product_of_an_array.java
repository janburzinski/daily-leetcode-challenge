class Solution {
    public int arraySign(int[] nums) {
        int negNums = 0;

        for(int num : nums) {
            if(num == 0) return 0;
            if(num < 0) negNums++; 
        }

        // if the amount of negative numbers is negative, 
        // then the product would be negative too
        return (negNums % 2 == 0) ? 1 : -1;
    }
}