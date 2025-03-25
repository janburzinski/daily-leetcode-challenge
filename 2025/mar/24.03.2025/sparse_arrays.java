import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        
        for(String query : queries) {
            int count = 0;
            for(String s : stringList) {
                if(s.equals(query)) count++;
            }
            result.add(count);
        }

        return result;
    }
}