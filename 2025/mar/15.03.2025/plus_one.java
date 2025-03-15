import java.math.BigInteger;

class Solution {
    // [1,2,3] : 123+1 -> [1,2,4]
    // [0,9] : 09+1 -> 10
    public int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();


        for(int i = 0; i < digits.length; i++) {
            s.append(digits[i]);
        }
        BigInteger num = new BigInteger(s.toString());

        num = num.add(BigInteger.ONE);

        return num.toString().chars().map(c -> c - '0').toArray();
    }
}