class Solution {
    public int lengthOfLastWord(String s) {
        String[] p = s.split(" ");
        int n = p.length;
        System.out.println("length: " + n);

        //edge case: there is only one word
        if(n == 0) {
            return s.length();
        }

       for(int i = p.length-1; i >= 0; i--) {
        if(p[i] == " ") {
            continue;
        } else {
            return p[i].length();
        }
    }

        return 0;
    }
}