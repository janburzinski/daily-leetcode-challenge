import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> sol = new ArrayList<>();

        for(int i = a.size() - 1; i >= 0; i--)
            sol.add(a.get(i));
        
        return sol;
    }
}