package in.sp.beans;


@Component
public class Student{
    private string name;
    private string email;
    private int rollno;

    public void setEmail(string email) {
        this.email = email;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}