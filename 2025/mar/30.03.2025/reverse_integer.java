// bool isNeg 
// - make num positive
// - reverse it
// - add neg sign if applicable

class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(x));
        
        if(x<0) {
            isNegative = true;
            s.deleteCharAt(0);
        }

        s.reverse();

        if(isNegative) {
            s.insert(0, "-");
        }

        return Integer.parseInt(s.toString());
    }
}