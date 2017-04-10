/**
 * Created by Cati on 10-Apr-17.
 */
public abstract class User {
    private Student student;
    private Secretary secretary;

    public User() {
    }

    public User(Student student)
    {
        this.student=student;
    }
    public User(Secretary secretary)
    {
        this.secretary=secretary;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
    abstract String type ();
}
