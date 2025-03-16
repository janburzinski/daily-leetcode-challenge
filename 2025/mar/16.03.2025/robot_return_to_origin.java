class Solution {

    //               mag,long
    // start position: (0,0)
    //
    // e.g.
    // L: (-1,0)
    // R: (1,0)
    // Up: (0,1)
    // Down: (0,-1)
    //

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;  

        for(int i = 0; i < moves.length(); i++) {
            String m = String.valueOf(moves.charAt(i));

            if(m.equals("U")) {
                y++;
            } else if(m.equals("D")) {
                y--;
            } else if(m.equals("L")) {
                x--;
            } else if(m.equals("R")) {
                x++;
            }
        }

        return x == 0 && y == 0;
    }
}