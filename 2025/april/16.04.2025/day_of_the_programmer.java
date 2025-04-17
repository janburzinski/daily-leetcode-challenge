import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Result {
    public static String dayOfProgrammer(int year) {
        int dayOfProgrammer = 256;
        if(year < 1918 && year % 100 == 0) dayOfProgrammer--;
        if(year == 1918) dayOfProgrammer += 13;
        return LocalDate.ofYearDay(year, dayOfProgrammer).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}