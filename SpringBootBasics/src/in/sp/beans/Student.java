package in.sp.beans;

public class Student {

    private String name;
    private int rollno;
    private String email;

    // ✅ Default constructor (IMPORTANT for Spring)
    public Student() {
        System.out.println("Student object created");
    }

    // setters (for Setter Dependency Injection)
    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
    }
}