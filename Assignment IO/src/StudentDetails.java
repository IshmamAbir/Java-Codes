import java.io.Serializable;

public class StudentDetails implements Serializable {
    private  int id;
    private String name;
    private Subject subject;

    public StudentDetails(int id, String name, Subject subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }
}

