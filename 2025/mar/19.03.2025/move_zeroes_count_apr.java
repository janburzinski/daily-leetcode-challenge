import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
            if(nums[i] != 0) a.add(nums[i]);

        // reassemble non null array
        for(int j = 0; j<a.size(); j++)
            nums[j] = a.get(j);

        // add zeroes
        for(int k = a.size(); k < nums.length; k++)
            nums[k] = 0;
    }
}