package People;

import java.util.ArrayList;

public class Professor extends Member {

    protected ArrayList<Student> students = new ArrayList<Student>();

    public Professor() {
        students = null;
    }

    public Professor(Member m) {
        super.setName(m.getName());
        super.setAddress(m.getAddress());
        super.setEmail(m.getEmail());
        super.setSSN(m.getSSN());
        //super.setDate(m.getDate());
        super.setBalance(m.getBalance());
        super.setID(m.getID());
        super.setNumOfBooks(m.getNumOfBooks());
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public int getNumOfStudents() {
        return students.size();
    }
}