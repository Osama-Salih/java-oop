import java.time.DayOfWeek;
import java.time.Month;

public class App {
    public static void main(String[] args) {
    
       enum WeekDays {
        MONDAY("Working day") {
            @Override
            public void testMethod() {
                System.out.println("MONDAY method");
            }
        }, TUESDAY {
            @Override
            public void testMethod() {
                System.out.println("TUESDAY method");
            }
         }; // WEDNESDAY, THURSDAY, FRIDAY("Day off"), SATURDAY;

        private String status;
        WeekDays(String status) {
            this.status = status;
        }

        WeekDays() {}

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public abstract void testMethod();
    };

    // WeekDays.TUESDAY.testMethod();
    System.out.println(DayOfWeek.FRIDAY);
    System.out.println(Month.JANUARY);
 }  

}