import java.util.HashMap;

class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        HashMap<Integer, Integer> candlesCount = new HashMap<>();
        int biggestCandle = Integer.MIN_VALUE;
        System.out.println("bc: "+biggestCandle);

        for(int candle : candles) {
            candlesCount.put(candle, candlesCount.getOrDefault(candle, 0) + 1);

            if(candle > biggestCandle) {
                biggestCandle = candle;
            }
        }

        return candlesCount.get(biggestCandle);
    }
}