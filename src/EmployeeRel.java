public class EmployeeRel {
    private int id;
    private float salary;
    private PersonalInformation personalInfo; // relationship composition or aggregation?
    private Department dept; // relationship composition or aggregation?

    public EmployeeRel(int id, float salary, String firstName, String lastName, String middleName, String booldGroup,
    String accountNumber, String nationality, int yearOfBirth, Department dept) {
        this.id = id;
        this.salary = salary;
        this.personalInfo = new PersonalInformation(firstName, lastName, middleName, booldGroup, accountNumber, nationality, yearOfBirth);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeRel [id=" + id + ", salary=" + salary + ", personalInfo=" + personalInfo + ", dept" + dept 
                + "]";
    }

    
    
}
