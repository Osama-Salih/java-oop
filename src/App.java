public class App {
    static void p(Employee1 el) {
        el.print();
    }
    public static void main(String[] args) throws Exception {
       Employee1 refArray[] = new Employee1[4];

       refArray[0] = new Employee1();
       refArray[1] = new SalariedEmployee();
       refArray[2] = new DailyEmployee();
       refArray[3] = new HourlyEmployee();

    //    for (int i = 0; i < refArray.length; i++) {
    //     refArray[i].print();
    //    }

       for (Employee1 em : refArray) {
        // em.print();
        p(em);
       }
    }
}
