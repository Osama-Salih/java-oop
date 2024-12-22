public class SalariedEmployee extends Employee1 {
    float bouns;
    int x;

    public SalariedEmployee() {}
    public SalariedEmployee(String name, String address, String department, String email, float salary, float bouns) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }

    public void print() {
        System.out.println("SalariedEmployee");
    }
    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + bouns;
    }
}
