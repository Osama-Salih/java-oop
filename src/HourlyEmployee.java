public class HourlyEmployee extends Employee1 {
    private float workOurPrice;
    private int hourlyRate;
    
    public HourlyEmployee() {};
    
    public HourlyEmployee(String name, String address, String department, String email, float salary,
            float workOurPrice, int hourlyRate) {
        super(name, address, department, email, salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }

    public void print() {
        System.out.println("HourlyEmployee");
    }
    public float getWorkOurPrice() {
        return workOurPrice;
    }
    public void setWorkOurPrice(float workOurPrice) {
        this.workOurPrice = workOurPrice;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float getSalary() {
        return workOurPrice * hourlyRate;
    }
}
