import java.io.Serializable;

public class Student2 implements Serializable {
    int id;
    String name;
    float grade;

    public Student2(int id, String name, float grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getGrade() {
        return grade;
    }
    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student2 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }
}
