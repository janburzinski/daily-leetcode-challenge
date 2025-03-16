import java.util.HashMap;

class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        // <Upper Case Letter, Lower Case Letter>
        HashMap<String,String> letters = new HashMap<String,String>();
        // hahahahahhahahahhahh
        letters.put("A", "a");
        letters.put("B", "b");
        letters.put("C", "c");
        letters.put("D", "d");
        letters.put("E", "e");
        letters.put("F", "f");
        letters.put("G", "g");
        letters.put("H", "h");
        letters.put("I", "i");
        letters.put("J", "j");
        letters.put("K", "k");
        letters.put("L", "l");
        letters.put("M", "m");
        letters.put("N", "n");
        letters.put("O", "o");
        letters.put("P", "p");
        letters.put("Q", "q");
        letters.put("R", "r");
        letters.put("S", "s");
        letters.put("T", "t");
        letters.put("U", "u");
        letters.put("V", "v");
        letters.put("W", "w");
        letters.put("X", "x");
        letters.put("Y", "y");
        letters.put("Z", "z");

        // obv. java has an toLowerCase function or a isUpperCase but that would be too easy
        // and too time saving hahahahhahh

        for(int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if(letters.containsKey(c)){
                result.append(letters.get(c));
                System.out.printf("buchsta: %s gefunden;; g: %s",c,letters.get(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}