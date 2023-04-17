package People;

public class Student extends Member {
    
    protected Professor advisor;

    public Student() {
        advisor = null;
    }

    public Student(Member m) {
        super.setName(m.getName());
        super.setAddress(m.getAddress());
        super.setEmail(m.getEmail());
        super.setSSN(m.getSSN());
        super.setDate(m.getDate());
        super.setBalance(m.getBalance());
        super.setID(m.getID());
        super.setNumOfBooks(m.getNumOfBooks());
    }

    public void setAdvisor(Professor prof) {
        this.advisor = prof;
    }

    public Professor getAdvisor() {
        return this.advisor;
    }
}