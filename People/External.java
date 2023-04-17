package People;

public class External extends Member {

    public External() {

    }

    public External(Member m) {
        super.setName(m.getName());
        super.setAddress(m.getAddress());
        super.setEmail(m.getEmail());
        super.setSSN(m.getSSN());
        super.setDate(m.getDate());
        super.setBalance(m.getBalance());
        super.setID(m.getID());
        super.setNumOfBooks(m.getNumOfBooks());
    }
}