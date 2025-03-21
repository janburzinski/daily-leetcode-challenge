import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] mat) {
        int n = mat.length;

        for(int i = 0; i < n; i++) { // row
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();

            for(int j = 0; j < n; j++) {
                int rowVal = mat[i][j];
                int colVal = mat[j][i];

                // duplicate check
                if(!rowSet.add(rowVal)) return false;
                if(!colSet.add(colVal)) return false;
            }
        }

        return true;
    }
}