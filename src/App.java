import java.util.EnumSet;
import java.util.EnumMap;

public class App {

    enum WeekDays {
        MONDAY, TUESDAY, WEDENSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
         EnumSet<WeekDays> days1 = EnumSet.range(WeekDays.WEDENSDAY, WeekDays.FRIDAY);

         EnumSet<WeekDays> days2 = EnumSet.noneOf(WeekDays.class);
         days2.add(WeekDays.MONDAY);
         days2.addAll(days1);
         days2.remove(WeekDays.MONDAY);
         days2.removeAll(days1);
         System.out.println(days2);

        EnumMap<WeekDays, String> daysMap = new EnumMap<>(WeekDays.class);
        daysMap.put(WeekDays.MONDAY, "Working day");
        daysMap.put(WeekDays.SUNDAY, "Working day");
        System.out.println(daysMap);
    }  
}