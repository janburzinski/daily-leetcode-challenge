import java.util.HashMap;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills.length == 0) return true;

        HashMap<Integer,Integer> count = new HashMap<>();
        count.put(5,0);
        count.put(10, 0);
        count.put(20, 0);

        /**
         * - hashmap to store bill count
         * - loop over the given bills and check if you could give enough bills out
         *      => 20 given -> 15 taken e.g. (3x 5er or 1x 10er 1x 5er)
         */

         for (int bill : bills) {
            if (bill == 5) {
                count.put(5, count.get(5) + 1);
            } else if (bill == 10) {
                if (count.get(5) >= 1) {
                    count.put(5, count.get(5) - 1);
                    count.put(10, count.get(10) + 1);
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (count.get(10) >= 1 && count.get(5) >= 1) {
                    count.put(10, count.get(10) - 1);
                    count.put(5, count.get(5) - 1);
                } else if (count.get(5) >= 3) {
                    count.put(5, count.get(5) - 3);
                } else {
                    return false; 
                }
            }
        }

        return true;
    }
}