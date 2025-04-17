import java.util.List;

class Result {
    public static int migratoryBirds(List<Integer> arr) {
        int[] freqArr = new int[5];
        for (int element : arr) {
            freqArr[element - 1]++;
        }

        int max = 1, id = 1;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > max) {
                max = freqArr[i];
                id = i + 1;
            }
        }
        return id;
    }
}