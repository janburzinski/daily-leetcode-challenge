import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Result {
    public static String timeConversion(String s) {
        DateTimeFormatter formatter12h = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter fomratter24h = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalTime time = LocalTime.parse(s, formatter12h);

        return time.format(fomratter24h);
    }
}