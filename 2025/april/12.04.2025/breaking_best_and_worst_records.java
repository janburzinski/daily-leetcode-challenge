import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);

        List<Integer> recordBroken = new ArrayList<>(); // [most_points_record_broken,least_points_record_broken]
        recordBroken.add(0);
        recordBroken.add(0);
        
        //recordBroken.set(0, 0); // times most points broken initial value 
        //recordBroken.set(1, 0); // times least points broken initial value

        for (int score : scores) {
            if(score > highestScore) {
                highestScore = score;
                recordBroken.set(0, recordBroken.get(0) + 1);
            } else if(score < lowestScore) {
                lowestScore = score;
                recordBroken.set(1, recordBroken.get(1) + 1);
            }
        }

        return recordBroken;
    }
}