class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for(int[] row : accounts) {
            int sum = 0;
            for(int munyun : row) {
                sum += munyun;
            }
            if(sum >= maxWealth) maxWealth = sum;
        }

        return maxWealth;
    }
}