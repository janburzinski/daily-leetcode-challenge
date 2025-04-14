import java.util.List;

class Result {
    public static int birthday(List<Integer> s, int day, int month) {
        int matches = 0;
        if(month > s.size()) return 0;
        for(int i = 0; i <= s.size() - month; i++) {
            int num = 0;
            for(int j = 0; j < month; j++) {
                num += s.get(i + j);
            }
            if(num == day) matches++;
        }
        return matches;
    }
}