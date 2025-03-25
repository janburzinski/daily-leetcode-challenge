import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

     /**
      * d=2
      * arr = [1,2,3,4,5]
      * after 2 rotations: [3,4,5,1,2]
      */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.size();
        d = d % n;

        for(int i = d; i < n; i++) {
            result.add(arr.get(i));
        }
        
        for(int i = 0; i < d; i++) { 
            result.add(arr.get(i));
        }

        return result;
    }

}