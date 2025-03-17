import java.util.HashMap;

class Solution {

    //
    // - written largest to smallest
    // - if smallest num is before biggest, we subtract it from biggest
    //
    // example:
    // II = 2 (1+1=2)
    // IV = 4 (1-5=4)
    // IX = 9 (1-10=9)
    // XII = 12 (10+1+1=12)
    // XXVII = 27 (10+10+5+1+1=27)

    public int romanToInt(String s) {
        HashMap<String,Integer> romans = new HashMap<>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M",1000);

        // kleine zahl NACH einer großen oder gleich großen zahl kommt, dann addieren
        // kleine zah VOR einer großen oder gleich großen zahl, dann subtrahieren


        return 0;
    }
}