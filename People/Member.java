package People;

public class Member extends Person {
    protected int id;//id for the memeber
    protected int numOfBooks;//how many books they have checked out
    //protected float balance; //every person should have a balance


    Member() {
        id = 0;
        numOfBooks = 0;
        //balance = 0;
    }

    public Member(Person p) {
        super.setName(p.getName());
        super.setAddress(p.getAddress());
        super.setEmail(p.getEmail());
        super.setSSN(p.getSSN());
        super.setDate(p.getDate());
    }
}