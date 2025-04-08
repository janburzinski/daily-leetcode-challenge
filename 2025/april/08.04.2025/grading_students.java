import java.util.ArrayList;
import java.util.List;

class Result {
    // ((x + 4) / 5) * 5

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        
        for(int grade : grades) {
            int a = (grade + 4) / 5 * 5;
            if(grade < 38) {
                result.add(grade);
            } else if(Math.abs(a-grade) < 3) {
                int n = roundUp(grade);
                result.add(n);
            } else {
                result.add(grade);
          }
        }

        return result;
    }

    public static int roundUp(int num) {
        int r = 5;
        int remainder = num % 5;
        if(remainder == 0) return num;
        return num + r - remainder;
    }
}