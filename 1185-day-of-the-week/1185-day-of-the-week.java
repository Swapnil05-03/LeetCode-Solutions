import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);

        String dayName = date.getDayOfWeek().toString();

        return dayName.charAt(0) + dayName.substring(1).toLowerCase();
    }
}