public class App {

    enum WeekDays {
        MONDAY, TUESDAY, WEDENSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
    //    Order order1 = new Order();
    //    order1.setStatus(Order.OrderStatus.DELIVERING);
    //    System.out.println(order1.isDeliverable());

    // System.out.println(WeekDays.MONDAY.ordinal()); 
        // System.out.println(WeekDays.SUNDAY.compareTo(WeekDays.WEDENSDAY));
        // System.out.println(WeekDays.MONDAY.toString() == "MONDAY");
        // System.out.println(WeekDays.MONDAY.name() == "MONDAY");
        // System.out.println(WeekDays.valueOf("MONDAY"));
        // for(WeekDays day : WeekDays.values()) {
        //     System.out.println(day);
        // }
        // System.out.println(Arrays.toString(WeekDays.values()));
        // System.out.println(Arrays.toString(WeekDays.values()));

        WeekDays day1 = WeekDays.FRIDAY;
        System.out.println(day1 == WeekDays.FRIDAY);
    }  
}