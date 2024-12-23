public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String middleName;
    private String booldGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBirth;
    
    public PersonalInformation() {
    }

    public PersonalInformation(String firstName, String lastName, String middleName, String booldGroup,
            String accountNumber, String nationality, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.booldGroup = booldGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonalInformation [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
                + ", booldGroup=" + booldGroup + ", accountNumber=" + accountNumber + ", nationality=" + nationality
                + ", yearOfBirth=" + yearOfBirth + "]";
    }
}
