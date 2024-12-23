final public class Student1 {
    final int STUDENT_ID;
    String name;
    int yearOfBirth; 
    final static float DEGREE_OF_SUCCESS;

    static {
        DEGREE_OF_SUCCESS = 20;
    }


    public Student1(final int STUDENT_ID, String name, int yearOfBirth) {
        // STUDENT_ID = 0;
        this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    @Override
   final public String toString() {
        return "Student1 [STUDENT_ID=" + STUDENT_ID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }
}